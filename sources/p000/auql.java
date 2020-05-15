package p000;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.trustagent.internal.ParcelableTrustAgentEvent;

/* renamed from: auql */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class auql extends dcj implements auqn {
    public auql(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.trustagent.internal.ITrustletService");
    }

    /* renamed from: a */
    public final void mo50798a(long j) {
        Parcel bj = mo8529bj();
        bj.writeLong(j);
        mo8530c(11, bj);
    }

    /* renamed from: b */
    public final void mo50802b(ParcelableTrustAgentEvent parcelableTrustAgentEvent) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, parcelableTrustAgentEvent);
        mo8530c(7, bj);
    }

    /* renamed from: c */
    public final boolean mo50803c() {
        Parcel a = mo8526a(2, mo8529bj());
        boolean a2 = dcl.m8167a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: d */
    public final boolean mo50804d() {
        Parcel a = mo8526a(3, mo8529bj());
        boolean a2 = dcl.m8167a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: e */
    public final boolean mo50805e() {
        Parcel a = mo8526a(4, mo8529bj());
        boolean a2 = dcl.m8167a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: f */
    public final boolean mo50806f() {
        Parcel a = mo8526a(5, mo8529bj());
        boolean a2 = dcl.m8167a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: g */
    public final Bundle mo50807g() {
        Parcel a = mo8526a(9, mo8529bj());
        Bundle bundle = (Bundle) dcl.m8163a(a, Bundle.CREATOR);
        a.recycle();
        return bundle;
    }

    /* renamed from: h */
    public final void mo50808h() {
        mo8530c(10, mo8529bj());
    }

    /* renamed from: a */
    public final void mo50799a(auqq auqq) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, auqq);
        mo8530c(8, bj);
    }

    /* renamed from: a */
    public final void mo50800a(ParcelableTrustAgentEvent parcelableTrustAgentEvent) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, parcelableTrustAgentEvent);
        mo8530c(6, bj);
    }

    /* renamed from: a */
    public final boolean mo50801a() {
        Parcel a = mo8526a(1, mo8529bj());
        boolean a2 = dcl.m8167a(a);
        a.recycle();
        return a2;
    }
}
