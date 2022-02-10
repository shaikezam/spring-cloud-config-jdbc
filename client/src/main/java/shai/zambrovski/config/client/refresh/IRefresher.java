package shai.zambrovski.config.client.refresh;

public interface IRefresher {
    /**
     * Used after refresh context for scheduler bean initialization
     */
    default void materializeAfterRefresh() {
    }
}