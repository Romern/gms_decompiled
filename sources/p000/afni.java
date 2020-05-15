package p000;

import android.accounts.Account;
import android.os.IInterface;
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

/* renamed from: afni */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public interface afni extends IInterface {
    /* renamed from: a */
    void mo32794a(afmq afmq);

    /* renamed from: a */
    void mo32795a(afmx afmx, Account account, int i, int i2, LatestFootprintFilter latestFootprintFilter);

    /* renamed from: a */
    void mo32796a(afmx afmx, Account account, int i, int i2, TimeSeriesFootprintsReadFilter timeSeriesFootprintsReadFilter);

    /* renamed from: a */
    void mo32797a(afna afna, Account account, int i, int i2, LatestFootprintFilter latestFootprintFilter);

    /* renamed from: a */
    void mo32798a(afna afna, Account account, int i, int i2, TimeSeriesFootprintsReadFilter timeSeriesFootprintsReadFilter);

    /* renamed from: a */
    void mo32799a(afnb afnb, Account account, int i);

    /* renamed from: a */
    void mo32800a(afnc afnc, Account account, int i, int i2, ByteArraySafeParcelable byteArraySafeParcelable);

    /* renamed from: a */
    void mo32801a(afnk afnk);

    /* renamed from: a */
    void mo32802a(rnt rnt);

    /* renamed from: a */
    void mo32803a(rnt rnt, Account account, int i, int i2, LatestFootprintFilter latestFootprintFilter, SyncStatus syncStatus);

    /* renamed from: a */
    void mo32804a(rnt rnt, Account account, int i, int i2, SyncPolicy syncPolicy, LatestFootprintFilter latestFootprintFilter);

    /* renamed from: a */
    void mo32805a(rnt rnt, Account account, int i, int i2, SyncPolicy syncPolicy, TimeSeriesFootprintsSubscriptionFilter timeSeriesFootprintsSubscriptionFilter);

    /* renamed from: a */
    void mo32806a(rnt rnt, Account account, int i, int i2, TimeSeriesFootprintsSubscriptionFilter timeSeriesFootprintsSubscriptionFilter, SyncStatus syncStatus);

    /* renamed from: a */
    void mo32807a(rnt rnt, Account account, int i, int i2, MdhFootprintListSafeParcelable mdhFootprintListSafeParcelable);

    /* renamed from: a */
    void mo32808a(rnt rnt, Account account, int i, int i2, byte[] bArr, ByteArraySafeParcelable byteArraySafeParcelable);

    /* renamed from: a */
    void mo32809a(rnt rnt, Account account, List list, SyncPolicy syncPolicy);

    /* renamed from: a */
    void mo32810a(rnt rnt, MdhBroadcastListenerKey mdhBroadcastListenerKey);

    /* renamed from: a */
    void mo32811a(rnt rnt, MdhBroadcastListenerKey mdhBroadcastListenerKey, MdhBroadcastListenerParams mdhBroadcastListenerParams);

    /* renamed from: a */
    void mo32812a(rnt rnt, String str);

    /* renamed from: a */
    void mo32813a(rnt rnt, byte[] bArr);

    /* renamed from: b */
    void mo32814b(afmq afmq);

    /* renamed from: b */
    void mo32815b(rnt rnt);

    /* renamed from: c */
    void mo32816c(rnt rnt);

    /* renamed from: d */
    void mo32817d(rnt rnt);

    /* renamed from: e */
    void mo32818e(rnt rnt);
}
