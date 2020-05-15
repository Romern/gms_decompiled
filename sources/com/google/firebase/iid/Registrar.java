package com.google.firebase.iid;

import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class Registrar {
    public List getComponents() {
        brsd a = brse.m114529a(FirebaseInstanceId.class);
        a.mo69829a(brsg.m114531b(brhf.class));
        a.mo69829a(brsg.m114531b(brsr.class));
        a.mo69829a(brsg.m114531b(brte.class));
        a.mo69829a(brsg.m114531b(brss.class));
        a.mo69829a(brsg.m114531b(brsw.class));
        a.mo69828a(brst.f143304a);
        a.mo69830b();
        brse a2 = a.mo69826a();
        brsd a3 = brse.m114529a(brsv.class);
        a3.mo69829a(brsg.m114531b(FirebaseInstanceId.class));
        a3.mo69828a(brsu.f143305a);
        return Arrays.asList(a2, a3.mo69826a(), brtd.m114557a("fire-iid", "20.1.6"));
    }
}
