package com.wix.reactnativenotifications.core.notification;

public interface IPushNotification {
    class InvalidNotificationException extends Exception {
        public InvalidNotificationException(String detailMessage) {
            super(detailMessage);
        }
    }

    /**
     * Handle an event where notification has just been received.
     * @throws InvalidNotificationException
     */
    void onReceived() throws InvalidNotificationException;

    /**
     * Handle an event where notification has already been dispatched and is not being opened by the device user.
     */
    void onOpened();

    /**
     * Handle a request to post this notification.
     * @return ID to optionally use for notification deletion.
     */
    int onPostRequest();

    PushNotificationProps asProps();
}
