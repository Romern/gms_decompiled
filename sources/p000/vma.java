package p000;

import android.widget.Toast;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.drive.p039ui.select.path.DriveIdPathElement;
import com.google.android.gms.drive.p039ui.select.path.PathElement;

/* renamed from: vma */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class vma implements rkl {

    /* renamed from: a */
    final /* synthetic */ vme f49483a;

    /* renamed from: b */
    private final boolean f49484b;

    /* renamed from: c */
    private final boolean f49485c;

    public vma(vme vme, boolean z, boolean z2) {
        this.f49483a = vme;
        this.f49484b = z;
        this.f49485c = z2;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo9454a(rkk rkk) {
        usa usa = (usa) rkk;
        if (usa.f48587a.mo17710c()) {
            vme vme = this.f49483a;
            vme.f49495h = true;
            vme.f49494g = usa.f48589c;
            vme.f49489a.mo25369a("query success with moreEntriesMayExist = %b", Boolean.valueOf(this.f49483a.f49494g));
            this.f49483a.mo28629a(usa.f48588b, this.f49484b);
            PathElement b = this.f49483a.f49498k.mo18351b();
            if (b instanceof DriveIdPathElement) {
                vme vme2 = this.f49483a;
                vme2.f49499l.mo18332a(vme2.f49496i, ((DriveIdPathElement) b).mo18340a());
                return;
            }
            return;
        }
        vme.f49489a.mo25374b("FileListAdapter", "Could not retrieve query result (%s)", usa.f48587a.f30116j);
        if (!this.f49485c) {
            vme vme3 = this.f49483a;
            vme3.f49495h = false;
            vme3.mo28633f();
            this.f49483a.mo171aJ();
            vmt vmt = this.f49483a.f49503p;
            if (vmt != null) {
                vmt.mo28646a(this.f49484b);
                return;
            }
            return;
        }
        vmt vmt2 = this.f49483a.f49503p;
        if (vmt2 != null) {
            vmt2.mo28645a();
        }
        vme vme4 = this.f49483a;
        if (vme4.f49494g) {
            vme4.f49494g = false;
            vme4.mo160O(vme4.f49492e.mo28682a());
        }
        Toast.makeText(this.f49483a.f49500m, (int) C0126R.string.drive_empty_doclist_cannot_retrieve, 1).show();
    }
}
