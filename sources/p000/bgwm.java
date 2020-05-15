package p000;

import android.accounts.Account;
import android.content.Context;
import com.android.volley.NetworkResponse;
import com.android.volley.VolleyError;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.android.location.reporting.service.ReportingSyncChimeraService;
import com.google.android.ulr.ApiMetadata;
import com.google.android.ulr.ApiRate;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: bgwm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgwm {

    /* renamed from: a */
    public final Context f117833a;

    /* renamed from: b */
    public final bgye f117834b;

    /* renamed from: c */
    public final bgwx f117835c;

    /* renamed from: d */
    public final bgyg f117836d;

    /* renamed from: e */
    public final bguc f117837e;

    /* renamed from: f */
    public final bgug f117838f;

    /* renamed from: g */
    public final bgue f117839g;

    /* renamed from: h */
    public final Random f117840h;

    /* renamed from: i */
    public final bgts f117841i;

    /* renamed from: j */
    private final aesh f117842j;

    /* renamed from: k */
    private final bgyf f117843k;

    /* renamed from: l */
    private final rjx f117844l;

    public bgwm(Context context, bgye bgye, bgyg bgyg, bgwx bgwx, bguc bguc, bgue bgue, bgug bgug, aesh aesh, rjx rjx, bgyf bgyf, bgts bgts, Random random) {
        this.f117833a = context;
        this.f117834b = bgye;
        this.f117843k = bgyf;
        this.f117835c = bgwx;
        this.f117836d = bgyg;
        this.f117837e = bguc;
        this.f117839g = bgue;
        this.f117838f = bgug;
        this.f117842j = aesh;
        this.f117844l = rjx;
        this.f117841i = bgts;
        this.f117840h = random;
    }

    /* renamed from: a */
    public static final void m100167a(Account account, Exception exc) {
        String a = aeqm.m52397a(account);
        String valueOf = String.valueOf(exc);
        StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 43 + String.valueOf(valueOf).length());
        sb.append("Batch Location Update failed for account ");
        sb.append(a);
        sb.append(": ");
        sb.append(valueOf);
        bgur.m100011a("GCoreUlr", sb.toString());
    }

    /* renamed from: a */
    public static final boolean m100168a(IOException iOException) {
        NetworkResponse networkResponse;
        Throwable cause = iOException.getCause();
        if (cause == null || !(cause instanceof VolleyError) || (networkResponse = ((VolleyError) cause).networkResponse) == null || networkResponse.statusCode != 400) {
            return false;
        }
        bgur.m100025c("GCoreUlr", "Request failed with HTTP 400, will not re-upload");
        return true;
    }

    /* renamed from: a */
    public final void mo63281a(Account account, bgwb bgwb, long j) {
        String valueOf = String.valueOf(bgwb);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 84);
        sb.append("Server reports setting change occurred after ");
        sb.append(j);
        sb.append(", requesting sync: ");
        sb.append(valueOf);
        bgur.m100011a("GCoreUlr", sb.toString());
        ReportingSyncChimeraService.m117310a(account, "LocationReporter", this.f117833a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:85:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* renamed from: a */
    public final void mo63282a(bguj bguj) {
        LocationAvailability locationAvailability;
        InterruptedException e;
        Object e2;
        aesh aesh = this.f117842j;
        bvxc bvxc = null;
        if (aesh == null) {
            try {
                locationAvailability = (LocationAvailability) aucu.m76783a(this.f117844l.mo24758m(), chcv.m148481b(), TimeUnit.MILLISECONDS);
                try {
                    String valueOf = String.valueOf(locationAvailability);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 43);
                    sb.append("getLocationAvailability() returned status: ");
                    sb.append(valueOf);
                    sb.toString();
                } catch (InterruptedException e3) {
                    e = e3;
                } catch (ExecutionException | TimeoutException e4) {
                    e2 = e4;
                    String valueOf2 = String.valueOf(e2);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 66);
                    sb2.append("Exception on FusedLocationProviderClient#getLocationAvailability: ");
                    sb2.append(valueOf2);
                    bgur.m100025c("GCoreUlr", sb2.toString());
                    if (locationAvailability == null) {
                    }
                }
            } catch (InterruptedException e5) {
                e = e5;
                locationAvailability = null;
                Thread.currentThread().interrupt();
                String valueOf3 = String.valueOf(e);
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 75);
                sb3.append("InterruptException on FusedLocationProviderClient#getLocationAvailability: ");
                sb3.append(valueOf3);
                bgur.m100025c("GCoreUlr", sb3.toString());
                if (locationAvailability == null) {
                }
            } catch (ExecutionException | TimeoutException e6) {
                e2 = e6;
                locationAvailability = null;
                String valueOf22 = String.valueOf(e2);
                StringBuilder sb22 = new StringBuilder(String.valueOf(valueOf22).length() + 66);
                sb22.append("Exception on FusedLocationProviderClient#getLocationAvailability: ");
                sb22.append(valueOf22);
                bgur.m100025c("GCoreUlr", sb22.toString());
                if (locationAvailability == null) {
                }
            }
        } else {
            locationAvailability = aesh.mo34509d();
        }
        if (locationAvailability == null) {
            long currentTimeMillis = System.currentTimeMillis();
            bvwp a = bgzq.m100484a(locationAvailability);
            bxvd da = bvwq.f157983r.mo74144da();
            if (a != null) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bvwq bvwq = (bvwq) da.f164949b;
                a.getClass();
                bvwq.f157990f = a;
                bvwq.f157985a |= 16;
            }
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bvwq bvwq2 = (bvwq) da.f164949b;
            bvwq2.f157985a |= 1;
            bvwq2.f157986b = currentTimeMillis;
            bguj.f117568c.add((bvwq) da.mo74062i());
            bvxc l = this.f117843k.mo63394l();
            if (l != null) {
                bxvd da2 = bvxc.f158036l.mo74144da();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bvxc bvxc2 = (bvxc) da2.f164949b;
                int i = bvxc2.f158038a | 512;
                bvxc2.f158038a = i;
                bvxc2.f158048k = false;
                long j = l.f158040c;
                int i2 = i | 2;
                bvxc2.f158038a = i2;
                bvxc2.f158040c = j;
                long j2 = l.f158039b;
                int i3 = i2 | 1;
                bvxc2.f158038a = i3;
                bvxc2.f158039b = j2;
                long j3 = l.f158043f;
                bvxc2.f158038a = i3 | 16;
                bvxc2.f158043f = j3;
                if ((l.f158038a & 128) != 0) {
                    bvvx bvvx = l.f158046i;
                    if (bvvx == null) {
                        bvvx = bvvx.f157863g;
                    }
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    bvxc bvxc3 = (bvxc) da2.f164949b;
                    bvvx.getClass();
                    bvxc3.f158046i = bvvx;
                    bvxc3.f158038a |= 128;
                }
                if ((l.f158038a & 32) != 0) {
                    int a2 = bvwz.m121553a(l.f158044g);
                    if (a2 == 0) {
                        a2 = 1;
                    }
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    bvxc bvxc4 = (bvxc) da2.f164949b;
                    bvxc4.f158044g = a2 - 1;
                    bvxc4.f158038a |= 32;
                }
                if ((l.f158038a & 64) != 0) {
                    int a3 = bvxb.m121555a(l.f158045h);
                    if (a3 == 0) {
                        a3 = 1;
                    }
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    bvxc bvxc5 = (bvxc) da2.f164949b;
                    bvxc5.f158045h = a3 - 1;
                    bvxc5.f158038a |= 64;
                }
                if ((l.f158038a & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                    String str = l.f158047j;
                    bvxc bvxc6 = (bvxc) da2.f164949b;
                    str.getClass();
                    bvxc6.f158038a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    bvxc6.f158047j = str;
                }
                if ((l.f158038a & 4) != 0) {
                    int a4 = bvwz.m121553a(l.f158041d);
                    if (a4 == 0) {
                        a4 = 1;
                    }
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    bvxc bvxc7 = (bvxc) da2.f164949b;
                    bvxc7.f158041d = a4 - 1;
                    bvxc7.f158038a |= 4;
                }
                if ((l.f158038a & 8) != 0) {
                    int a5 = bvxb.m121555a(l.f158042e);
                    if (a5 == 0) {
                        a5 = 1;
                    }
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    bvxc bvxc8 = (bvxc) da2.f164949b;
                    bvxc8.f158042e = a5 - 1;
                    bvxc8.f158038a |= 8;
                }
                bvxc = (bvxc) da2.mo74062i();
            }
            if (bvxc != null) {
                ArrayList arrayList = bguj.f117568c;
                sdo.m34959a(bvxc);
                bxvd da3 = bvwq.f157983r.mo74144da();
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                bvwq bvwq3 = (bvwq) da3.f164949b;
                bvxc.getClass();
                bvwq3.f157987c = bvxc;
                int i4 = bvwq3.f157985a | 2;
                bvwq3.f157985a = i4;
                long j4 = bvxc.f158039b;
                bvwq3.f157985a = i4 | 1;
                bvwq3.f157986b = j4;
                arrayList.add((bvwq) da3.mo74062i());
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    public final void mo63283a(bguk bguk) {
        LocationAvailability locationAvailability;
        bguk bguk2 = bguk;
        aesh aesh = this.f117842j;
        ApiRate apiRate = null;
        if (aesh == null) {
            try {
                locationAvailability = (LocationAvailability) aucu.m76783a(this.f117844l.mo24758m(), chcv.m148481b(), TimeUnit.MILLISECONDS);
                try {
                    String valueOf = String.valueOf(locationAvailability);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 43);
                    sb.append("getLocationAvailability() returned status: ");
                    sb.append(valueOf);
                    sb.toString();
                } catch (InterruptedException e) {
                    e = e;
                } catch (ExecutionException | TimeoutException e2) {
                    e = e2;
                    String valueOf2 = String.valueOf(e);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 66);
                    sb2.append("Exception on FusedLocationProviderClient#getLocationAvailability: ");
                    sb2.append(valueOf2);
                    bgur.m100025c("GCoreUlr", sb2.toString());
                    if (locationAvailability == null) {
                    }
                }
            } catch (InterruptedException e3) {
                e = e3;
                locationAvailability = null;
                Thread.currentThread().interrupt();
                String valueOf3 = String.valueOf(e);
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 75);
                sb3.append("InterruptException on FusedLocationProviderClient#getLocationAvailability: ");
                sb3.append(valueOf3);
                bgur.m100025c("GCoreUlr", sb3.toString());
                if (locationAvailability == null) {
                }
            } catch (ExecutionException | TimeoutException e4) {
                e = e4;
                locationAvailability = null;
                String valueOf22 = String.valueOf(e);
                StringBuilder sb22 = new StringBuilder(String.valueOf(valueOf22).length() + 66);
                sb22.append("Exception on FusedLocationProviderClient#getLocationAvailability: ");
                sb22.append(valueOf22);
                bgur.m100025c("GCoreUlr", sb22.toString());
                if (locationAvailability == null) {
                }
            }
        } else {
            locationAvailability = aesh.mo34509d();
        }
        if (locationAvailability == null) {
            bguk2.f117574c.add(new ApiMetadata(null, null, null, null, bgzr.m100487a(locationAvailability), null, null, null, Long.valueOf(System.currentTimeMillis()), null, null));
            ApiRate k = this.f117843k.mo63393k();
            if (k != null) {
                apiRate = new ApiRate(k.getBleRate(), k.mo71575b(), false, k.mo71577d(), k.mo71578e(), k.mo71579f(), k.mo71580g(), k.mo71582h(), k.mo71583i(), k.mo71584j());
            }
            if (apiRate != null) {
                bguk2.f117574c.add(bgzr.m100488a(apiRate));
            }
        }
    }
}
