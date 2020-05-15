package p000;

import android.os.RemoteException;
import com.android.volley.VolleyError;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.drive.internal.StringListResponse;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

/* renamed from: udj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class udj extends ucj {
    static {
        new sbw("GetFolderColorPaletteOp", "");
    }

    public udj(ubk ubk, uto uto) {
        super("GetFolderColorPaletteOp", ubk, uto, null);
    }

    /* renamed from: a */
    public final Set mo27229a() {
        return EnumSet.of(twt.f46774c, twt.f46772a, twt.f46773b);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x006c, code lost:
        r0 = r1.f47237a;
        r2 = r0.f47142c.f49757d;
        r0 = r0.f47143d;
        r3 = r0.f47394a;
        r2.mo27422b(r3.f47683b, r0.f47395b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0086, code lost:
        throw new p000.aaaj(13, "App is no longer authorized to make this request.");
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x006b A[ExcHandler: gid (e gid), Splitter:B:2:0x0018] */
    /* renamed from: c */
    public final void mo27235c() {
        ubk ubk = this.f47237a;
        vff vff = ubk.f47142c.f49760g;
        String str = ubk.f47143d.f47394a.f47682a;
        List a = vff.mo28382a(str);
        if (a.isEmpty()) {
            try {
                ubk ubk2 = this.f47237a;
                vpu vpu = ubk2.f47142c;
                vkv vkv = vpu.f49762i;
                ClientContext a2 = ubk2.f47143d.mo27262a(vpu.f49755b);
                vlb vlb = new vlb(vkv.mo28605a(a2, 2821));
                shc shc = new shc();
                shc.mo25530a("folderColorPalette");
                vpu.f49760g.mo28383a(this.f47237a.mo27073a(), vlb.mo28609a(a2, null, null, null, null, null, null, null, null, shc).f30936b);
                a = vff.mo28382a(str);
            } catch (VolleyError e) {
                vpg.m41006a(e);
                throw e;
            } catch (gid e2) {
            } catch (VolleyError e3) {
                throw new aaaj(7, "Unable to fetch folder color palette while offline.");
            }
        }
        try {
            this.f47238b.mo27981a(new StringListResponse(a));
        } catch (RemoteException e4) {
            vcv g = this.f47239c.mo28306g();
            g.mo28256b();
            g.mo28254a();
        }
    }
}
