package p000;

import android.content.Context;
import android.os.ConditionVariable;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.droidguard.DroidGuardResultsRequest;
import com.google.android.gms.droidguard.internal.DroidGuardInitReply;
import java.io.FileNotFoundException;
import java.util.Map;

/* renamed from: vxo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vxo extends dck implements vxp {

    /* renamed from: a */
    protected final ConditionVariable f50196a;

    /* renamed from: b */
    protected vyc f50197b;

    /* renamed from: c */
    protected vza f50198c;

    /* renamed from: d */
    protected Throwable f50199d;

    /* renamed from: e */
    private final String f50200e;

    /* renamed from: f */
    private final Context f50201f;

    /* renamed from: g */
    private final vwf f50202g;

    /* renamed from: h */
    private final vyo f50203h;

    /* renamed from: i */
    private String f50204i;

    public vxo() {
        super("com.google.android.gms.droidguard.internal.IDroidGuardHandle");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003f, code lost:
        r8 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0041, code lost:
        r8 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0042, code lost:
        r7.f50199d = r8;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003f A[ExcHandler: LinkageError (e java.lang.LinkageError), Splitter:B:1:0x0003] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004f A[SYNTHETIC, Splitter:B:24:0x004f] */
    /* renamed from: a */
    public final DroidGuardInitReply mo28937a(String str, DroidGuardResultsRequest droidGuardResultsRequest) {
        vza vza;
        vyy vyy;
        vyc vyc;
        String str2;
        vyo vyo;
        vza vza2;
        this.f50204i = str;
        try {
            vyc = this.f50197b;
            str2 = this.f50200e;
            vyo = this.f50203h;
            if (!cdrq.m134759b() || !vwh.m41491a(str)) {
                vza2 = null;
            } else {
                vza2 = vyc.mo28951a(str, vyo, droidGuardResultsRequest);
            }
        } catch (Exception e) {
            vyc.f50223d.mo28911a(e);
            vza2 = null;
        } catch (LinkageError e2) {
        }
        if (vza2 == null) {
            vza2 = vyc.mo28950a(str2, str, vyo, null, droidGuardResultsRequest);
        }
        if (vza2.mo28989a()) {
            this.f50198c = vza2;
            this.f50196a.open();
            if (this.f50199d == null) {
                try {
                    vza = this.f50198c;
                    Parcelable parcelable = (Parcelable) vza.f50268a.getClass().getDeclaredMethod("rb", new Class[0]).invoke(vza.f50268a, new Object[0]);
                    if (parcelable != null) {
                        vyc vyc2 = this.f50197b;
                        vyj vyj = this.f50198c.f50270c;
                        vyz vyz = vyc2.f50222c;
                        vyy = vyj.f50236b;
                        vyx a = vyz.f50264c.mo28981a(vyy);
                        if (a != null) {
                            a.f50258a.setReadable(true, false);
                            return new DroidGuardInitReply(ParcelFileDescriptor.open(a.f50258a, 268435456), parcelable);
                        }
                        String valueOf = String.valueOf(vyy);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 30);
                        sb.append("VM key ");
                        sb.append(valueOf);
                        sb.append(" not found in the cache");
                        throw new vxy(sb.toString());
                    }
                } catch (Exception e3) {
                    throw new vyw(vza.f50269b, e3);
                } catch (FileNotFoundException e4) {
                    String valueOf2 = String.valueOf(vyy);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 33);
                    sb2.append("Files for VM ");
                    sb2.append(valueOf2);
                    sb2.append(" not found on disk: ");
                    throw new vxy(sb2.toString(), e4);
                } catch (Exception e5) {
                    this.f50198c = null;
                    this.f50199d = e5;
                }
            }
            return new DroidGuardInitReply(null, null);
        }
        throw new Exception("init failed");
    }

    public vxo(String str, Context context, vyc vyc, vyo vyo) {
        super("com.google.android.gms.droidguard.internal.IDroidGuardHandle");
        this.f50196a = new ConditionVariable();
        this.f50200e = str;
        this.f50197b = vyc;
        this.f50201f = context;
        this.f50202g = vwf.m41483a(context);
        this.f50203h = vyo;
        this.f50198c = null;
        this.f50199d = null;
    }

    /* renamed from: a */
    public final void mo28938a() {
        this.f50196a.block();
        vza vza = this.f50198c;
        if (vza != null) {
            try {
                vza.mo28991b();
            } catch (Exception e) {
                this.f50202g.mo28911a(e);
            }
        }
        this.f50198c = null;
        this.f50199d = null;
    }

    /* renamed from: a */
    public final void mo28939a(String str) {
        mo28937a(str, null);
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            mo28939a(parcel.readString());
        } else if (i == 2) {
            byte[] a = mo28940a(dcl.m8170c(parcel));
            parcel2.writeNoException();
            parcel2.writeByteArray(a);
        } else if (i == 3) {
            mo28938a();
        } else if (i != 5) {
            return false;
        } else {
            DroidGuardInitReply a2 = mo28937a(parcel.readString(), (DroidGuardResultsRequest) dcl.m8163a(parcel, DroidGuardResultsRequest.CREATOR));
            parcel2.writeNoException();
            dcl.m8169b(parcel2, a2);
        }
        return true;
    }

    /* renamed from: a */
    public final byte[] mo28940a(Map map) {
        this.f50196a.block();
        Throwable th = this.f50199d;
        if (th != null) {
            return vwn.m41495a(this.f50204i, this.f50201f, map, th);
        }
        vza vza = this.f50198c;
        if (vza == null) {
            return vwn.m41495a(this.f50204i, this.f50201f, map, new IllegalStateException());
        }
        try {
            return (byte[]) vza.f50268a.getClass().getDeclaredMethod("ss", Map.class).invoke(vza.f50268a, map);
        } catch (Exception e) {
            throw new vyw(vza.f50269b, e);
        } catch (Exception e2) {
            return vwn.m41495a(this.f50204i, this.f50201f, map, e2);
        }
    }
}
