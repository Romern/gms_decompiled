package com.google.firebase.messaging;

import com.google.firebase.iid.FirebaseInstanceId;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FirebaseMessagingRegistrar {
    public List getComponents() {
        brsd a = brse.m114529a(FirebaseMessaging.class);
        a.mo69829a(brsg.m114531b(brhf.class));
        a.mo69829a(brsg.m114531b(FirebaseInstanceId.class));
        a.mo69829a(brsg.m114531b(brte.class));
        a.mo69829a(brsg.m114531b(brss.class));
        a.mo69829a(brsg.m114530a(eif.class));
        a.mo69829a(brsg.m114531b(brsw.class));
        a.mo69828a(brsz.f143309a);
        a.mo69830b();
        return Arrays.asList(a.mo69826a(), brtd.m114557a("fire-fcm", "20.1.6"));
    }
}
