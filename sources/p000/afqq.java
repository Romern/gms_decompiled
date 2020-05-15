package p000;

import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.mobstore.OpenFileDescriptorRequest;
import com.google.android.gms.mobstore.OpenFileDescriptorResponse;
import java.io.File;
import java.io.FileNotFoundException;

/* renamed from: afqq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class afqq extends aaab {

    /* renamed from: a */
    private final OpenFileDescriptorRequest f64565a;

    /* renamed from: b */
    private final ahbk f64566b;

    /* renamed from: c */
    private final afqj f64567c;

    /* renamed from: d */
    private final String f64568d;

    /* renamed from: e */
    private final afqr f64569e;

    /* renamed from: f */
    private final befb f64570f;

    public afqq(OpenFileDescriptorRequest openFileDescriptorRequest, ahbk ahbk, afqj afqj, String str, afqr afqr, befb befb) {
        super(160, "OpenFileDescriptorOperation");
        this.f64565a = openFileDescriptorRequest;
        this.f64566b = ahbk;
        this.f64567c = afqj;
        this.f64568d = str;
        this.f64569e = afqr;
        this.f64570f = befb;
    }

    /* renamed from: a */
    private final void m53454a() {
        bbev.m87909b("%s: file not found: %s", "MobStore.OpenFileDescriptorOperation", this.f64565a.f80390a);
        String valueOf = String.valueOf(this.f64565a.f80390a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 16);
        sb.append("File not found: ");
        sb.append(valueOf);
        this.f64566b.mo36275a(new Status(33500, sb.toString()), null);
        m53455a(this.f64565a.f80391b, 6);
    }

    /* renamed from: a */
    private final void m53455a(int i, int i2) {
        m53456a(i, i2, bmvz.f131120a);
    }

    /* renamed from: a */
    private final void m53456a(int i, int i2, bmxv bmxv) {
        int i3;
        if (i != 0) {
            i3 = i != 1 ? 2 : 4;
        } else {
            i3 = 3;
        }
        bxvd da = bpyj.f139868f.mo74144da();
        String str = this.f64568d;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpyj bpyj = (bpyj) da.f164949b;
        str.getClass();
        bpyj.f139870a = 1 | bpyj.f139870a;
        bpyj.f139871b = str;
        bpyj.f139872c = bqau.m112486a(i2);
        bpyj.f139870a |= 2;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpyj bpyj2 = (bpyj) da.f164949b;
        bpyj2.f139873d = bqas.m112484a(i3);
        bpyj2.f139870a |= 4;
        if (bmxv.mo66813a()) {
            long longValue = ((Long) bmxv.mo66814b()).longValue();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpyj bpyj3 = (bpyj) da.f164949b;
            bpyj3.f139870a |= 8;
            bpyj3.f139874e = longValue;
        }
        this.f64567c.mo34987a((bpyj) da.mo74062i());
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x011f, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0120, code lost:
        r10.f64566b.mo36275a(r11.f64574a, null);
        m53455a(r10.f64565a.f80391b, r11.f64575b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0130, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x011f A[Catch:{ RemoteException -> 0x0105 }, ExcHandler: afqs (r11v1 'e' afqs A[CUSTOM_DECLARE, Catch:{ RemoteException -> 0x0105 }]), Splitter:B:1:0x0007] */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        int i;
        try {
            afqu.m53465a(this.f64565a.f80390a, context);
            OpenFileDescriptorRequest openFileDescriptorRequest = this.f64565a;
            int i2 = openFileDescriptorRequest.f80391b;
            if (i2 == 0) {
                afqr afqr = this.f64569e;
                Uri uri = openFileDescriptorRequest.f80390a;
                absk absk = afqr.m53459b(uri).f58112b;
                if (absk == null) {
                    absk = absk.f58105c;
                }
                afqr.mo35000a(absk, uri);
            } else if (i2 == 1) {
                this.f64569e.mo35001a(openFileDescriptorRequest.f80390a);
            } else {
                ahbk ahbk = this.f64566b;
                String valueOf = String.valueOf(openFileDescriptorRequest.f80390a);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 31);
                sb.append("Open Type not supported (yet): ");
                sb.append(valueOf);
                ahbk.mo36275a(new Status(10, sb.toString()), null);
                m53455a(this.f64565a.f80391b, 5);
                return;
            }
            File b = befj.m94964a(context, this.f64570f).mo60665b(this.f64565a.f80390a);
            bmxv bmxv = bmvz.f131120a;
            int i3 = this.f64565a.f80391b;
            if (i3 == 0) {
                bmxv = bmxv.m108566b(Long.valueOf(b.length()));
                i = 268435456;
            } else if (i3 == 1) {
                b.getParentFile().mkdirs();
                i = 738197504;
            } else {
                i = 0;
            }
            try {
                this.f64566b.mo36275a(Status.f30107a, new OpenFileDescriptorResponse(ParcelFileDescriptor.open(b, i)));
                m53456a(this.f64565a.f80391b, 3, bmxv);
            } catch (FileNotFoundException e) {
                if (b.exists()) {
                    bbev.m87909b("%s: file can not be opened with the requested mode: %s", "MobStore.OpenFileDescriptorOperation", this.f64565a.f80390a);
                    String valueOf2 = String.valueOf(this.f64565a.f80390a);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 22);
                    sb2.append("Access denied to uri: ");
                    sb2.append(valueOf2);
                    this.f64566b.mo36275a(new Status(10, sb2.toString()), null);
                    m53455a(this.f64565a.f80391b, 5);
                    return;
                }
                m53454a();
            }
        } catch (begt e2) {
            if (e2.getCause() instanceof bego) {
                m53454a();
                return;
            }
            throw e2;
        } catch (afqs e3) {
        } catch (begt e4) {
            try {
                this.f64566b.mo36275a(new Status(10, e4.getMessage()), null);
                m53455a(this.f64565a.f80391b, 4);
            } catch (RemoteException e5) {
                m53455a(this.f64565a.f80391b, 7);
                bbev.m87911b(e5, "%s: Client died during OpenFileDescriptorOperation", "MobStore.OpenFileDescriptorOperation");
            }
        }
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        bbev.m87912c("%s: onFailure: %s", "MobStore.OpenFileDescriptorOperation", status);
        this.f64566b.mo36275a(status, null);
    }
}
