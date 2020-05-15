package p000;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.android.volley.VolleyError;
import com.google.android.gms.location.places.internal.PlacesParams;
import java.util.concurrent.TimeoutException;

/* renamed from: bien */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bien extends aaab {

    /* renamed from: a */
    protected PlacesParams f120388a;

    /* renamed from: b */
    private final bidi f120389b;

    /* renamed from: c */
    private final bhpt f120390c;

    /* renamed from: d */
    private final bidx f120391d;

    /* renamed from: e */
    private final String f120392e;

    /* renamed from: f */
    private int f120393f = 0;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sfr.a(java.lang.String, boolean):int
     arg types: [java.lang.String, int]
     candidates:
      sfr.a(android.content.Context, com.google.android.gms.common.internal.ClientContext):sfr
      sfr.a(java.lang.String, boolean):int */
    public bien(int i, String str, PlacesParams placesParams, bidi bidi, bidx bidx, String str2, bhpt bhpt) {
        super(i, str);
        sdo.m34959a(placesParams);
        sdo.m34959a(bidi);
        sdo.m34959a(bidx);
        sdo.m34959a(bhpt);
        this.f120388a = placesParams;
        this.f120389b = bidi;
        this.f120391d = bidx;
        this.f120390c = bhpt;
        this.f120392e = str2;
        if (!TextUtils.isEmpty(str2)) {
            if (cghe.m145416b()) {
                this.f120393f = this.f120389b.mo64545a(placesParams).mo25482a(this.f120392e, false);
            } else {
                this.f120393f = this.f120389b.mo64545a(placesParams).mo25481a(this.f120392e);
            }
        }
        if (this.f120393f != -1) {
            return;
        }
        if (!cgfl.f186724a.mo6606a().mo83594a() || !"com.google.android.gms".equals(bidi.f120299b)) {
            String valueOf = String.valueOf(this.f120392e);
            throw new SecurityException(valueOf.length() == 0 ? new String("Caller doesn't have access to ") : "Caller doesn't have access to ".concat(valueOf));
        } else {
            this.f120393f = -2;
        }
    }

    /* renamed from: a */
    protected static aaaj m102124a(Exception exc) {
        if (exc instanceof gid) {
            return new biem(8);
        }
        if (exc instanceof TimeoutException) {
            return new biem(7);
        }
        if (exc instanceof VolleyError) {
            return new biem(biam.m101858a((VolleyError) exc));
        }
        if (exc instanceof chuw) {
            return new biem(7);
        }
        Log.wtf("Places", "Unexpected exception in convertServerException", exc);
        throw new RuntimeException(exc);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo64562a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract int mo64563b();

    /* renamed from: c */
    public abstract bpqk mo64564c();

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public String[] mo64565d() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public boolean mo64566e() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final biam mo64567f() {
        return this.f120389b.mo64544a(this.f120388a, this.f120390c);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final bibq mo64568g() {
        return this.f120389b.mo64546b(this.f120388a, this.f120390c);
    }

    /* renamed from: a */
    private static final PlacesParams m102125a(PlacesParams placesParams) {
        return new PlacesParams(placesParams.f79572b, placesParams.f79573c, null, placesParams.f79575e, placesParams.f79576f, placesParams.f79577g);
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0126  */
    /* renamed from: a */
    public void mo6502a(Context context) {
        int b;
        bpqk c;
        String str = this.f120388a.f79572b;
        String str2 = this.f120389b.f120299b;
        if (!str2.equals("com.google.android.gms") && !str2.equals(str)) {
            throw new aaaj(13, "Non-GMS Core client trying to spoof their package name");
        }
        PlacesParams placesParams = this.f120388a;
        String str3 = this.f120389b.f120299b;
        if (placesParams.f79577g != 0 && !"com.google.android.gms".equals(str3)) {
            throw new aaaj(13, "requestSource may only be set by com.google.android.gms");
        } else if (this.f120393f == -2) {
            String valueOf = String.valueOf(this.f120392e);
            throw new aaaj(13, valueOf.length() == 0 ? new String("Caller doesn't have access to ") : "Caller doesn't have access to ".concat(valueOf));
        } else {
            String[] d = mo64565d();
            if (d != null) {
                int length = d.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        if (d[i].equals(this.f120389b.f120299b)) {
                            break;
                        }
                        i++;
                    } else {
                        break;
                    }
                }
                b = mo64563b();
                if (b != 1) {
                    this.f120388a = m102125a(this.f120388a);
                } else if (b == 2) {
                    try {
                        bidx bidx = this.f120391d;
                        PlacesParams placesParams2 = this.f120388a;
                        bidx.mo64561a(placesParams2.f79572b, placesParams2.f79575e);
                    } catch (aaaj e) {
                        this.f120388a = m102125a(this.f120388a);
                    }
                } else if (b != 3) {
                    int b2 = mo64563b();
                    StringBuilder sb = new StringBuilder(35);
                    sb.append("Unknown personalization ");
                    sb.append(b2);
                    throw new IllegalArgumentException(sb.toString());
                } else if (!TextUtils.isEmpty(this.f120388a.f79574d)) {
                    bidx bidx2 = this.f120391d;
                    PlacesParams placesParams3 = this.f120388a;
                    bidx2.mo64561a(placesParams3.f79572b, placesParams3.f79575e);
                } else {
                    throw new aaaj(10, "Account name can't be empty!");
                }
                int i2 = Build.VERSION.SDK_INT;
                if (!cgga.f186804a.mo6606a().mo83669a() && mo64566e() && this.f120389b.mo64545a(this.f120388a).f44143b.mo25963e("android:monitor_location", this.f120389b.mo64543a(this.f120388a.f79572b), this.f120388a.f79572b) == 4) {
                    throw new aaaj(9009, "Caller doesn't have required background location permission.");
                } else if (cgfl.m145006b() && (c = mo64564c()) != null) {
                    this.f120390c.mo64139a(bhqq.m101346a(c));
                    return;
                }
            }
            int a = mo64562a();
            if (a != 1) {
                if (a == 2) {
                    this.f120391d.mo64560a(context, this.f120389b.f120299b);
                } else if (a == 3) {
                    this.f120391d.mo64560a(context, this.f120389b.f120299b);
                    if (!cggm.f186849a.mo6606a().mo83731j() && !"com.google.android.gms".equals(this.f120389b.f120299b)) {
                        throw new aaaj(13, "This API is for internal (GMS Core) use only.");
                    }
                } else {
                    int a2 = mo64562a();
                    StringBuilder sb2 = new StringBuilder(30);
                    sb2.append("Unknown visibility ");
                    sb2.append(a2);
                    throw new IllegalArgumentException(sb2.toString());
                }
            }
            b = mo64563b();
            if (b != 1) {
            }
            int i22 = Build.VERSION.SDK_INT;
            if (!cgga.f186804a.mo6606a().mo83669a()) {
            }
            if (cgfl.m145006b()) {
            }
        }
    }
}
