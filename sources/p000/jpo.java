package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.auth.proximity.RemoteDevice;
import com.google.android.gms.auth.proximity.Role;
import com.google.android.gms.auth.proximity.firstparty.SecureChannelSubscription;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: jpo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jpo implements jkg {

    /* renamed from: a */
    public static final Logger f22990a = jsy.m17256a("FirstPartyRegistry");

    /* renamed from: b */
    public final jnj f22991b = jnj.m16961a();

    /* renamed from: c */
    public final jqw f22992c = jqw.m17133a();

    /* renamed from: d */
    public final AtomicBoolean f22993d = new AtomicBoolean(false);

    /* renamed from: e */
    public final AtomicInteger f22994e = new AtomicInteger(0);

    /* renamed from: f */
    public final bqgj f22995f;

    public jpo() {
        bqgj a = bqgs.m112811a((ExecutorService) snp.m35704b(10));
        this.f22995f = a;
    }

    /* renamed from: a */
    public static void m17070a(Context context, SecureChannelSubscription secureChannelSubscription, String str, int i) {
        Bundle bundle = new Bundle();
        bundle.putString("EXTRA_DEVICE_ID", str);
        bundle.putInt("EXTRA_CONNECTION_MEDIUM", i);
        secureChannelSubscription.mo7812a(context, bundle);
    }

    /* renamed from: a */
    public final Status mo13978a(SecureChannelSubscription secureChannelSubscription) {
        if (((List) this.f22992c.mo14004b().get()).contains(secureChannelSubscription)) {
            return Status.f30107a;
        }
        this.f22994e.incrementAndGet();
        return (Status) this.f22992c.mo14002a(secureChannelSubscription).get();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ Status mo13979a(String str, int i, Context context) {
        String str2 = str;
        int i2 = i;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = mo13981a().iterator();
        while (true) {
            int i3 = 0;
            if (!it.hasNext()) {
                break;
            }
            SecureChannelSubscription secureChannelSubscription = (SecureChannelSubscription) it.next();
            if (Role.m6771a(secureChannelSubscription.f11180c, i2)) {
                List b = secureChannelSubscription.mo7802b();
                int size = b.size();
                while (true) {
                    if (i3 >= size) {
                        break;
                    }
                    int i4 = i3 + 1;
                    if (((RemoteDevice) b.get(i3)).f11138b.equals(str2)) {
                        arrayList2.add(secureChannelSubscription);
                        break;
                    }
                    i3 = i4;
                }
            }
        }
        int size2 = arrayList2.size();
        int i5 = 0;
        for (int i6 = 0; i6 < size2; i6++) {
            SecureChannelSubscription secureChannelSubscription2 = (SecureChannelSubscription) arrayList2.get(i6);
            try {
                m17070a(context, secureChannelSubscription2, str2, i2);
                i5++;
            } catch (PendingIntent.CanceledException e) {
                arrayList.add(secureChannelSubscription2);
            }
        }
        RemoteDevice b2 = this.f22991b.mo13906b(str2);
        int size3 = arrayList.size();
        for (int i7 = 0; i7 < size3; i7++) {
            SecureChannelSubscription secureChannelSubscription3 = (SecureChannelSubscription) arrayList.get(i7);
            if (b2 != null) {
                if (!new jpm(this, bnkn.m109665a(this.f22991b.mo13906b(str2)), new Role(secureChannelSubscription3.f11179b, secureChannelSubscription3.f11180c), secureChannelSubscription3.f11178a, secureChannelSubscription3.f11182e, false).call().equals(Status.f30107a)) {
                    f22990a.mo25416d("Failed to remove canceled intent.", new Object[0]);
                }
            }
        }
        return (i5 != 0 || arrayList.isEmpty()) ? Status.f30107a : Status.f30111e;
    }

    /* renamed from: a */
    public final Status mo13980a(List list, SecureChannelSubscription secureChannelSubscription) {
        Status status;
        if (!((List) this.f22992c.mo14004b().get()).contains(secureChannelSubscription)) {
            status = Status.f30107a;
        } else {
            this.f22994e.decrementAndGet();
            status = (Status) this.f22992c.mo14005b(secureChannelSubscription).get();
        }
        if (!Status.f30107a.equals(status)) {
            return status;
        }
        ArrayList arrayList = new ArrayList(secureChannelSubscription.mo7802b());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.remove((RemoteDevice) it.next());
        }
        if (arrayList.isEmpty()) {
            return Status.f30107a;
        }
        jqf jqf = new jqf();
        jqf.f23046a = secureChannelSubscription.f11178a;
        jqf.f23048c = new Role(secureChannelSubscription.f11179b, secureChannelSubscription.f11180c);
        jqf.mo13990a(arrayList);
        jqf.f23047b = secureChannelSubscription.f11182e;
        return mo13978a(jqf.mo13989a());
    }

    /* renamed from: a */
    public final List mo13981a() {
        ArrayList arrayList = new ArrayList();
        try {
            return (List) this.f22992c.mo14004b().get();
        } catch (InterruptedException | ExecutionException e) {
            f22990a.mo25418e("Failed to retrieve subscriptions.", new Object[0]);
            return arrayList;
        }
    }
}
