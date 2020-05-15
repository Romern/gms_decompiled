package p000;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.mdh.LatestFootprintFilter;
import com.google.android.gms.mdh.MdhBroadcastListenerKey;
import com.google.android.gms.mdh.MdhBroadcastListenerParams;
import com.google.android.gms.mdh.SyncPolicy;
import com.google.android.gms.mdh.SyncStatus;
import com.google.android.gms.mdh.TimeSeriesFootprintsReadFilter;
import com.google.android.gms.mdh.TimeSeriesFootprintsSubscriptionFilter;
import com.google.android.gms.mdh.internal.ByteArraySafeParcelable;
import com.google.android.gms.mdh.internal.MdhFootprintListSafeParcelable;
import java.util.List;

/* renamed from: afng */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afng extends dcj implements afni {
    public afng(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.mdh.internal.IMobileDataHubService");
    }

    /* renamed from: a */
    public final void mo32794a(afmq afmq) {
        throw null;
    }

    /* renamed from: a */
    public final void mo32796a(afmx afmx, Account account, int i, int i2, TimeSeriesFootprintsReadFilter timeSeriesFootprintsReadFilter) {
        throw null;
    }

    /* renamed from: a */
    public final void mo32798a(afna afna, Account account, int i, int i2, TimeSeriesFootprintsReadFilter timeSeriesFootprintsReadFilter) {
        throw null;
    }

    /* renamed from: a */
    public final void mo32799a(afnb afnb, Account account, int i) {
        throw null;
    }

    /* renamed from: a */
    public final void mo32800a(afnc afnc, Account account, int i, int i2, ByteArraySafeParcelable byteArraySafeParcelable) {
        throw null;
    }

    /* renamed from: a */
    public final void mo32801a(afnk afnk) {
        throw null;
    }

    /* renamed from: a */
    public final void mo32802a(rnt rnt) {
        throw null;
    }

    /* renamed from: a */
    public final void mo32803a(rnt rnt, Account account, int i, int i2, LatestFootprintFilter latestFootprintFilter, SyncStatus syncStatus) {
        throw null;
    }

    /* renamed from: a */
    public final void mo32805a(rnt rnt, Account account, int i, int i2, SyncPolicy syncPolicy, TimeSeriesFootprintsSubscriptionFilter timeSeriesFootprintsSubscriptionFilter) {
        throw null;
    }

    /* renamed from: a */
    public final void mo32806a(rnt rnt, Account account, int i, int i2, TimeSeriesFootprintsSubscriptionFilter timeSeriesFootprintsSubscriptionFilter, SyncStatus syncStatus) {
        throw null;
    }

    /* renamed from: a */
    public final void mo32807a(rnt rnt, Account account, int i, int i2, MdhFootprintListSafeParcelable mdhFootprintListSafeParcelable) {
        throw null;
    }

    /* renamed from: a */
    public final void mo32809a(rnt rnt, Account account, List list, SyncPolicy syncPolicy) {
        throw null;
    }

    /* renamed from: a */
    public final void mo32812a(rnt rnt, String str) {
        throw null;
    }

    /* renamed from: a */
    public final void mo32813a(rnt rnt, byte[] bArr) {
        throw null;
    }

    /* renamed from: b */
    public final void mo32814b(afmq afmq) {
        throw null;
    }

    /* renamed from: b */
    public final void mo32815b(rnt rnt) {
        throw null;
    }

    /* renamed from: c */
    public final void mo32816c(rnt rnt) {
        throw null;
    }

    /* renamed from: d */
    public final void mo32817d(rnt rnt) {
        throw null;
    }

    /* renamed from: e */
    public final void mo32818e(rnt rnt) {
        throw null;
    }

    /* renamed from: a */
    public final void mo32795a(afmx afmx, Account account, int i, int i2, LatestFootprintFilter latestFootprintFilter) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, afmx);
        dcl.m8165a(bj, account);
        bj.writeInt(i);
        bj.writeInt(i2);
        dcl.m8165a(bj, latestFootprintFilter);
        mo8528b(9, bj);
    }

    /* renamed from: a */
    public final void mo32797a(afna afna, Account account, int i, int i2, LatestFootprintFilter latestFootprintFilter) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, afna);
        dcl.m8165a(bj, account);
        bj.writeInt(i);
        bj.writeInt(i2);
        dcl.m8165a(bj, latestFootprintFilter);
        mo8528b(19, bj);
    }

    /* renamed from: a */
    public final void mo32804a(rnt rnt, Account account, int i, int i2, SyncPolicy syncPolicy, LatestFootprintFilter latestFootprintFilter) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, rnt);
        dcl.m8165a(bj, account);
        bj.writeInt(i);
        bj.writeInt(i2);
        dcl.m8165a(bj, syncPolicy);
        dcl.m8165a(bj, latestFootprintFilter);
        mo8528b(11, bj);
    }

    /* renamed from: a */
    public final void mo32808a(rnt rnt, Account account, int i, int i2, byte[] bArr, ByteArraySafeParcelable byteArraySafeParcelable) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, rnt);
        dcl.m8165a(bj, account);
        bj.writeInt(i);
        bj.writeInt(i2);
        bj.writeByteArray(bArr);
        dcl.m8165a(bj, byteArraySafeParcelable);
        mo8528b(10, bj);
    }

    /* renamed from: a */
    public final void mo32810a(rnt rnt, MdhBroadcastListenerKey mdhBroadcastListenerKey) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, rnt);
        dcl.m8165a(bj, mdhBroadcastListenerKey);
        mo8528b(23, bj);
    }

    /* renamed from: a */
    public final void mo32811a(rnt rnt, MdhBroadcastListenerKey mdhBroadcastListenerKey, MdhBroadcastListenerParams mdhBroadcastListenerParams) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, rnt);
        dcl.m8165a(bj, mdhBroadcastListenerKey);
        dcl.m8165a(bj, mdhBroadcastListenerParams);
        mo8528b(22, bj);
    }
}
