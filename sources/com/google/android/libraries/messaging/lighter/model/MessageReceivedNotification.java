package com.google.android.libraries.messaging.lighter.model;

import android.os.Parcelable;
import java.io.Serializable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class MessageReceivedNotification implements Parcelable, Serializable {
    /* renamed from: j */
    public static bcts m94855j() {
        bcts bcts = new bcts();
        bcts.mo57538a(false);
        return bcts;
    }

    /* renamed from: a */
    public abstract ConversationId mo60508a();

    /* renamed from: b */
    public abstract String mo60509b();

    /* renamed from: c */
    public abstract ContactId mo60510c();

    /* renamed from: d */
    public abstract String mo60511d();

    /* renamed from: e */
    public abstract String mo60512e();

    /* renamed from: f */
    public abstract String mo60514f();

    /* renamed from: g */
    public abstract String mo60515g();

    /* renamed from: h */
    public abstract String mo60516h();

    /* renamed from: i */
    public abstract boolean mo60518i();
}
