package p000;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.location.NetworkLocationStatus;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: bgcg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgcg {

    /* renamed from: a */
    public final HashMap f116030a = new HashMap(1);

    /* renamed from: b */
    public final ssq f116031b = new ssq();

    /* renamed from: c */
    public bfor f116032c = null;

    /* renamed from: d */
    public long f116033d = Long.MAX_VALUE;

    /* renamed from: e */
    public long f116034e = Long.MAX_VALUE;

    /* renamed from: f */
    public long f116035f = Long.MAX_VALUE;

    /* renamed from: g */
    public boolean f116036g = false;

    /* renamed from: h */
    public bhcv f116037h = new bhcw();

    /* renamed from: i */
    bfnc f116038i = null;

    /* renamed from: a */
    private static int m98580a(int i) {
        if (i == 0) {
            return 0;
        }
        switch (i) {
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 9;
            default:
                return 1;
        }
    }

    /* renamed from: a */
    public static final Intent m98581a() {
        Intent intent = new Intent();
        intent.putExtra("com.google.android.location.internal.EXTRA_RELEASE_VERSION", 2023);
        return intent;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo62636a(Context context, boolean z) {
        Iterator it = this.f116030a.values().iterator();
        boolean z2 = false;
        Intent intent = null;
        while (it.hasNext()) {
            if (intent == null) {
                intent = m98581a();
                intent.putExtra("providerEnabled", z);
            }
            bgck bgck = (bgck) it.next();
            if (!bgck.mo62597a(context, intent)) {
                String valueOf = String.valueOf(bgck);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
                sb.append("dropping intent receiver");
                sb.append(valueOf);
                sb.toString();
                bfor bfor = this.f116032c;
                if (bfor != null) {
                    bfor.mo62052a(bfos.LOCATION_PENDING_INTENT_DROPPED, bgck.f116017h.hashCode(), bgck.f116017h.getTargetPackage());
                }
                it.remove();
                z2 = true;
            }
        }
        if (z2) {
            mo62638a(this.f116030a.values());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo62637a(Context context, bfnc[] bfncArr) {
        bfnc[] bfncArr2 = bfncArr;
        this.f116038i = bfncArr2[bfncArr2.length - 1];
        Iterator it = this.f116030a.values().iterator();
        Intent intent = null;
        boolean z = false;
        while (it.hasNext()) {
            bgce bgce = (bgce) it.next();
            if (intent == null) {
                intent = m98581a();
                NetworkLocationStatus[] networkLocationStatusArr = new NetworkLocationStatus[bfncArr2.length];
                for (int i = 0; i < bfncArr2.length; i++) {
                    bfnc bfnc = bfncArr2[i];
                    networkLocationStatusArr[i] = NetworkLocationStatus.m66872a(m98580a(bfnc.f114460a), m98580a(bfnc.f114461b), bfnc.f114462c, bfnc.f114463d);
                }
                sef.m35072a(Arrays.asList(networkLocationStatusArr), intent, "com.google.android.location.internal.LOCATION_STATUS");
            }
            if (!bgce.mo62597a(context, intent)) {
                String valueOf = String.valueOf(bgce);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
                sb.append("dropping intent receiver");
                sb.append(valueOf);
                sb.toString();
                bfor bfor = this.f116032c;
                if (bfor != null) {
                    bfor.mo62052a(bfos.LOCATION_PENDING_INTENT_DROPPED, bgce.f116017h.hashCode(), bgce.f116017h.getTargetPackage());
                }
                it.remove();
                z = true;
            }
        }
        if (z) {
            mo62638a(this.f116030a.values());
        }
    }

    /* renamed from: a */
    public final void mo62638a(Collection collection) {
        bhcv bhcv;
        this.f116034e = Long.MAX_VALUE;
        this.f116035f = Long.MAX_VALUE;
        this.f116033d = Long.MAX_VALUE;
        this.f116036g = false;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            bgce bgce = (bgce) it.next();
            long j = bgce.f116051q;
            this.f116036g |= bgce.f116021l;
            String valueOf = String.valueOf(bgce);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 36);
            sb.append("Still have location intent receiver ");
            sb.append(valueOf);
            sb.toString();
            if (bgce.f116026a) {
                this.f116034e = Math.min(this.f116034e, j);
            } else {
                this.f116033d = Math.min(this.f116033d, j);
            }
            long max = Math.max(bgce.f116018i, j);
            long j2 = bgce.f116051q;
            StringBuilder sb2 = new StringBuilder(83);
            sb2.append("Batch: this client period is ");
            sb2.append(j2);
            sb2.append(" and can wait ");
            sb2.append(max);
            sb2.toString();
            long min = Math.min(this.f116035f, max);
            this.f116035f = min;
            StringBuilder sb3 = new StringBuilder(53);
            sb3.append("Batch: minBatchIntervalMillis is ");
            sb3.append(min);
            sb3.toString();
        }
        long j3 = this.f116035f;
        StringBuilder sb4 = new StringBuilder(44);
        sb4.append("BATCH: batchInterval is ");
        sb4.append(j3);
        sb4.toString();
        if (this.f116033d <= this.f116034e) {
            this.f116034e = Long.MAX_VALUE;
        }
        this.f116037h = new bhcw();
        double min2 = (double) Math.min(this.f116033d, this.f116034e);
        Double.isNaN(min2);
        long j4 = (long) (((min2 + 1.0d) * 3.0d) / 2.0d);
        for (bgce bgce2 : this.f116030a.values()) {
            if (bgce2.f116051q < j4 && (bhcv = bgce2.f116023n) != null) {
                this.f116037h.mo63558a(bhcv);
            }
        }
    }
}
