package p000;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ConnectionInfo;
import com.google.android.gms.common.internal.GetServiceRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: rzu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class rzu extends scm {

    /* renamed from: c */
    static final int[] f43902c = {0, 2, 3, 21, 4, 5, 22, 6, 23, 1, 7, 24, 8, 25, 26, 27, 28, 9, 29, 10, 11, 19, 30, 31, 12, 13, 14, 15, 0, 0, 17, 32, 33, 0, 35, 36, 37, 38, 18, 0, 39, 40, 4, 41, 20, 42};

    /* renamed from: a */
    private final AtomicReference f43903a = new AtomicReference(bdgs.m90764a().mo58027b());

    /* renamed from: d */
    public final Context f43904d;

    /* renamed from: e */
    protected final Set f43905e;

    /* renamed from: f */
    protected final List f43906f = new ArrayList();

    /* renamed from: g */
    protected final List f43907g = new ArrayList();

    /* renamed from: a */
    public static final boolean m34713a(GetServiceRequest getServiceRequest) {
        return getServiceRequest.mo17822a() != null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo12163a(String str, int i) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo6393a(sbj sbj, GetServiceRequest getServiceRequest);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public Map mo25274b() {
        return null;
    }

    protected rzu(Context context, int i, int... iArr) {
        this.f43904d = context;
        int length = iArr.length;
        C1225nr nrVar = new C1225nr(length + 1);
        this.f43905e = nrVar;
        nrVar.add(Integer.valueOf(i));
        for (int i2 : iArr) {
            this.f43905e.add(Integer.valueOf(i2));
        }
        this.f43906f.add(new sdm(this.f43904d, i, mo6392a(), mo25274b()));
        if (cdpf.m134588b()) {
            this.f43906f.add(new sdz(this.f43904d));
        }
        if (sre.m36080a(this.f43904d)) {
            this.f43906f.add(new sdv());
        }
        this.f43906f.add(new sda(this.f43904d));
        this.f43906f.add(new sbd(this.f43904d));
        sdd sdd = new sdd(this.f43904d);
        this.f43906f.add(sdd);
        this.f43907g.add(sdd);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Set mo6392a() {
        return sft.m35178d();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo16737a(int i, sck sck, int i2, String str, String str2, String[] strArr, Bundle bundle, IBinder iBinder, String str3, String str4) {
        Account account;
        int i3 = f43902c[i];
        if (!TextUtils.isEmpty(str2)) {
            account = new Account(str2, "com.google");
        } else {
            account = null;
        }
        GetServiceRequest getServiceRequest = new GetServiceRequest(i3);
        getServiceRequest.f30229c = i2;
        getServiceRequest.f30230d = str;
        getServiceRequest.f30234h = account;
        getServiceRequest.f30237k = false;
        if (bundle == null) {
            bundle = Bundle.EMPTY;
        }
        getServiceRequest.f30233g = bundle;
        if (strArr != null) {
            getServiceRequest.mo17823a(stc.m36282a(strArr));
        }
        mo25273a(sck, getServiceRequest);
    }

    @Deprecated
    /* renamed from: a */
    public final void mo25272a(sck sck) {
        try {
            sck.mo16677a(0, null);
        } catch (RuntimeException e) {
            Log.e("AbstractServiceBroker", "Validating account failed", e);
            throw e;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        mo6393a(r13, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0119, code lost:
        r0 = p000.bdgs.m90764a();
        r2 = new java.lang.StringBuilder(22);
        r2.append(r11);
        r2.append("-GetService");
        r0.mo58025a(r12, r2.toString());
        r0 = (p000.bdij) r1.f43903a.getAndSet(null);
        r2 = p000.bdgs.m90764a();
        r3 = new java.lang.StringBuilder(25);
     */
    /* renamed from: a */
    public final void mo25273a(sck sck, GetServiceRequest getServiceRequest) {
        int i;
        bdij bdij;
        bdgs a;
        StringBuilder sb;
        Bundle bundle;
        GetServiceRequest getServiceRequest2 = getServiceRequest;
        int i2 = getServiceRequest2.f30228b;
        boolean z = false;
        if (this.f43905e.contains(Integer.valueOf(i2)) || this.f43905e.contains(0)) {
            z = true;
        }
        StringBuilder sb2 = new StringBuilder(34);
        sb2.append("Unexpected service id: ");
        sb2.append(i2);
        sdo.m34975b(z, sb2.toString());
        bdij b = bdgs.m90764a().mo58027b();
        String str = getServiceRequest2.f30230d;
        if (str != null) {
            spn.m35872c(this.f43904d, str);
        }
        if (!spn.m35869b()) {
            i = !rfz.m33557a(this.f43904d).mo24610b(str) ? 4 : 3;
        } else {
            i = 2;
        }
        if (sdt.f44074f.f44076b && i == 3) {
            sdt sdt = sdt.f44074f;
            if (sdt.f44076b && sdt.f44075a.contains(str)) {
                i = 6;
            }
        }
        mo12163a(str, i);
        try {
            ConnectionInfo connectionInfo = new ConnectionInfo();
            sbj sbj = r6;
            ConnectionInfo connectionInfo2 = connectionInfo;
            sbj sbj2 = new sbj(sck, getServiceRequest, connectionInfo, this.f43904d, aaam.m21024b(getServiceRequest2, i), Binder.getCallingUid());
            sbj.f43994a.addAll(this.f43907g);
            Iterator it = this.f43906f.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ConnectionResult a2 = ((sbg) it.next()).mo25330a(getServiceRequest2, connectionInfo2);
                if (!a2.mo17671b()) {
                    PendingIntent pendingIntent = a2.f30066d;
                    if (pendingIntent != null) {
                        bundle = new Bundle();
                        bundle.putParcelable("pendingIntent", pendingIntent);
                    } else {
                        bundle = null;
                    }
                    connectionInfo2.f30223a = bundle;
                    sbj.mo16679a(a2.f30065c, (IBinder) null, connectionInfo2);
                    bdgs a3 = bdgs.m90764a();
                    StringBuilder sb3 = new StringBuilder(22);
                    sb3.append(i2);
                    sb3.append("-GetService");
                    a3.mo58025a(b, sb3.toString());
                    bdij = (bdij) this.f43903a.getAndSet(null);
                    a = bdgs.m90764a();
                    sb = new StringBuilder(25);
                }
            }
            sb.append(i2);
            sb.append("-ServiceBroker");
            a.mo58025a(bdij, sb.toString());
        } catch (RuntimeException e) {
            Log.e("AbstractServiceBroker", "Getting service failed", e);
            throw e;
        } catch (Throwable th) {
            bdgs a4 = bdgs.m90764a();
            StringBuilder sb4 = new StringBuilder(22);
            sb4.append(i2);
            sb4.append("-GetService");
            a4.mo58025a(b, sb4.toString());
            bdgs a5 = bdgs.m90764a();
            StringBuilder sb5 = new StringBuilder(25);
            sb5.append(i2);
            sb5.append("-ServiceBroker");
            a5.mo58025a((bdij) this.f43903a.getAndSet(null), sb5.toString());
            throw th;
        }
    }
}
