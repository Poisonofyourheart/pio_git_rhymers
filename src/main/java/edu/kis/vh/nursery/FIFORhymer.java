package edu.kis.vh.nursery;

/**
 * FIFORhymer is a specialized type of DefaultCountingOutRhymer.
 * It implements a FIFO (First-In-First-Out) behavior for the rhymer.
 */
public class FIFORhymer extends DefaultCountingOutRhymer {

    // Temporary rhymer used for implementing FIFO behavior
    private final DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();

    /**
     * Overrides the countOut method to provide FIFO behavior.
     *
     * @return The value of the first item that was added (FIFO).
     */
    @Override
    protected int countOut() {
        // Move all elements from the main rhymer to the temp rhymer
        while (!callCheck())
            temp.countIn(super.countOut());

        // Retrieve the first element added (which is now on the top of the temp rhymer)
        int ret = temp.countOut();

        // Move all elements back from the temp rhymer to the main rhymer
        while (!temp.callCheck())
            countIn(temp.countOut());

        return ret;
    }
}
