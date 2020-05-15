package p000;

import com.google.android.gms.mdi.mobstore.MobStoreFileService;
import com.google.android.gms.mobstore.DeleteFileRequest;
import com.google.android.gms.mobstore.OpenFileDescriptorRequest;
import com.google.android.gms.mobstore.RenameRequest;

/* renamed from: afqp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afqp extends ahbm implements aaai {

    /* renamed from: a */
    private final MobStoreFileService f64559a;

    /* renamed from: b */
    private final aaag f64560b;

    /* renamed from: c */
    private final afqj f64561c;

    /* renamed from: d */
    private final String f64562d;

    /* renamed from: e */
    private final afqr f64563e;

    /* renamed from: f */
    private final befb f64564f;

    public afqp(MobStoreFileService mobStoreFileService, aaag aaag, afqj afqj, String str, afqr afqr, befb befb) {
        this.f64559a = mobStoreFileService;
        this.f64560b = aaag;
        this.f64561c = afqj;
        this.f64562d = str;
        this.f64563e = afqr;
        this.f64564f = befb;
    }

    /* renamed from: a */
    public final void mo34997a(ahbk ahbk, DeleteFileRequest deleteFileRequest) {
        this.f64560b.mo16659a(this.f64559a, new afqi(deleteFileRequest, ahbk, this.f64561c, this.f64562d, this.f64563e));
    }

    /* renamed from: a */
    public final void mo34998a(ahbk ahbk, OpenFileDescriptorRequest openFileDescriptorRequest) {
        this.f64560b.mo16659a(this.f64559a, new afqq(openFileDescriptorRequest, ahbk, this.f64561c, this.f64562d, this.f64563e, this.f64564f));
    }

    /* renamed from: a */
    public final void mo34999a(ahbk ahbk, RenameRequest renameRequest) {
        this.f64560b.mo16659a(this.f64559a, new afqt(renameRequest, ahbk, this.f64561c, this.f64562d, this.f64563e));
    }
}
