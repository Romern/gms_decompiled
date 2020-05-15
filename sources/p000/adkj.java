package p000;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.instantapps.internal.AppInfo;
import com.google.android.gms.instantapps.internal.InstantAppPreLaunchInfo;
import com.google.android.gms.instantapps.internal.Route;
import com.google.android.gms.instantapps.internal.RoutingOptions;
import java.util.Iterator;
import java.util.Map;

/* renamed from: adkj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class adkj extends sji {

    /* renamed from: a */
    private static final adfs f62029a = new adfs("GetPreLaunchInfoOperation");

    /* renamed from: d */
    private final adgc f62030d;

    /* renamed from: e */
    private final Intent f62031e;

    /* renamed from: f */
    private final adjx f62032f;

    /* renamed from: g */
    private final adkd f62033g;

    /* renamed from: h */
    private final adkn f62034h;

    /* renamed from: i */
    private final adkr f62035i;

    /* renamed from: j */
    private final SharedPreferences f62036j;

    /* renamed from: k */
    private final int f62037k;

    /* renamed from: l */
    private final RoutingOptions f62038l;

    public adkj(adgc adgc, Intent intent, adjx adjx, adkd adkd, adkn adkn, adkr adkr, SharedPreferences sharedPreferences, int i, RoutingOptions routingOptions) {
        super(121, "GetPreLaunchInfo");
        this.f62030d = adgc;
        this.f62031e = intent;
        this.f62032f = adjx;
        this.f62033g = adkd;
        this.f62034h = adkn;
        this.f62035i = adkr;
        this.f62036j = sharedPreferences;
        this.f62037k = i;
        this.f62038l = routingOptions;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x006a A[SYNTHETIC, Splitter:B:28:0x006a] */
    /* renamed from: a */
    public final void mo11356a(Context context) {
        boolean z;
        boolean z2;
        String str;
        boolean z3;
        Iterator<Map.Entry<String, ?>> it;
        boolean z4;
        adkz adkz = new adkz();
        adkz.mo33627a(1406);
        if (this.f62031e.hasExtra("com.google.android.gms.instantapps.INTENT_HMAC")) {
            try {
                adkz.mo33627a(1408);
                adjx adjx = this.f62032f;
                Intent intent = this.f62031e;
                byte[] byteArrayExtra = intent.getByteArrayExtra("com.google.android.gms.instantapps.INTENT_HMAC");
                if (byteArrayExtra != null) {
                    if (byteArrayExtra.length == 32) {
                        byte[] c = adjx.mo33595c(intent);
                        if (c.length == 32) {
                            byte b = 0;
                            for (int i = 0; i < byteArrayExtra.length; i++) {
                                b = (byte) (b | (c[i] ^ byteArrayExtra[i]));
                            }
                            if (b == 0) {
                                z4 = true;
                                adkz.mo33627a(1409);
                                if (z4) {
                                    z = z4;
                                } else {
                                    try {
                                        adjx.m50674b(this.f62031e);
                                        adkz.mo33627a(1407);
                                        this.f62030d.mo33446a(Status.f30107a, InstantAppPreLaunchInfo.m66758a(this.f62031e, false, adkz.mo33628a()));
                                        return;
                                    } catch (adjw e) {
                                        throw new adkl(e);
                                    }
                                }
                            }
                        }
                    }
                }
                f62029a.mo33429c("Intent signature invalid", new Object[0]);
                z4 = false;
                try {
                    adkz.mo33627a(1409);
                } catch (adjw e2) {
                }
            } catch (adjw e3) {
                z4 = false;
                f62029a.mo33429c("Intent signature compute failure", new Object[0]);
                if (z4) {
                }
            }
            if (z4) {
            }
        } else {
            try {
                adjx.m50674b(this.f62031e);
                z = false;
            } catch (adjw e4) {
                throw new adkl(e4);
            }
        }
        Uri data = this.f62031e.getData();
        sdo.m34959a(data);
        adke a = this.f62033g.mo33597a(data.toString(), this.f62037k == 0, this.f62038l, adkz, false);
        int i2 = a.f61993a;
        if (i2 == 0) {
            adkz.mo33627a(1407);
            this.f62030d.mo33446a(Status.f30107a, InstantAppPreLaunchInfo.m66758a(this.f62031e, z, adkz.mo33628a()));
        } else if (i2 == 1) {
            if (((long) this.f62035i.f62072b.getInt("optInNumDeclines", 0)) >= cepl.m137724e() - 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            Intent a2 = adlb.m50785a(z2);
            adkz.mo33627a(1407);
            adgc adgc = this.f62030d;
            Status status = Status.f30107a;
            Intent intent2 = this.f62031e;
            String str2 = a.f61998f;
            int i3 = a.f61999g;
            int i4 = a.f62000h;
            String str3 = a.f62001i;
            byte[] bArr = a.f62002j;
            boolean z5 = a.f61996d == 3;
            byte[] a3 = adkz.mo33628a();
            sdo.m34959a(a2);
            sdo.m34959a(intent2);
            adgc.mo33446a(status, new InstantAppPreLaunchInfo(1, null, z, a2, intent2, null, null, z5, a3, str2, i3, i4, str3, bArr, null));
        } else if (i2 == 2) {
            Account a4 = this.f62034h.mo33600a();
            if (a4 == null && !this.f62038l.f79198c) {
                f62029a.mo33430d("null account even though opt in check was not disabled", new Object[0]);
            }
            adkz.mo33627a(1407);
            adgc adgc2 = this.f62030d;
            Status status2 = Status.f30107a;
            if (a4 == null) {
                str = "";
            } else {
                str = a4.name;
            }
            Intent intent3 = this.f62031e;
            String str4 = a.f61998f;
            int i5 = a.f61999g;
            int i6 = a.f62000h;
            String str5 = a.f62001i;
            byte[] bArr2 = a.f62002j;
            AppInfo appInfo = a.f61994b;
            Route route = a.f61995c;
            if (a.f61996d == 3) {
                z3 = true;
            } else {
                z3 = false;
            }
            byte[] a5 = adkz.mo33628a();
            Map<String, ?> all = this.f62036j.getAll();
            Bundle bundle = new Bundle(all.size());
            Iterator<Map.Entry<String, ?>> it2 = all.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry<String, ?> next = it2.next();
                try {
                    it = it2;
                    try {
                        bundle.putString(next.getKey(), (String) next.getValue());
                        it2 = it;
                    } catch (ClassCastException e5) {
                        e = e5;
                        f62029a.mo33424a(e);
                        it2 = it;
                    }
                } catch (ClassCastException e6) {
                    e = e6;
                    it = it2;
                    f62029a.mo33424a(e);
                    it2 = it;
                }
            }
            sdo.m34959a((Object) str);
            sdo.m34959a(intent3);
            adgc2.mo33446a(status2, new InstantAppPreLaunchInfo(2, str, z, null, intent3, appInfo, route, z3, a5, str4, i5, i6, str5, bArr2, bundle));
        } else {
            throw new IllegalStateException("Invalid InstantAppPreLaunchInfo.Destination value");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo11357a(Status status) {
        this.f62030d.mo33446a(Status.f30109c, (InstantAppPreLaunchInfo) null);
    }
}
