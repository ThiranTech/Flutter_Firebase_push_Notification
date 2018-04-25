Scenario:
Consider a flutter application designed for leave request approval. The basic workflow for this application is whenever a person posts a request to approve his leave, the higher officials should be notified.
The only way to achieve this is to provide a push notification. Currently, the Flutter plugin(FirebaseMessaging) available to use the Firebase Cloud Messaging service for push notifications doesn't provide an option to add action buttons to the notification layouts.
 So in order to add the action button to notifications, the only way we have now is to create the notification in native and integrate it with Flutter.

The solution for the above scenario is provided.


