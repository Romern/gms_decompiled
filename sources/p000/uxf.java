package p000;

import com.google.android.gms.drive.internal.model.File;

/* renamed from: uxf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class uxf extends uxv {
    public uxf(uvy uvy) {
        super(uvy, false, null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo28099a(ujx ujx, String str) {
        return Boolean.valueOf(ujx.mo27547Y());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo28100a(File file, Object obj) {
        file.f30982Y = ((Boolean) obj).booleanValue();
        file.f30983a.add(79);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo28101a(ujx ujx, String str, Object obj, long j) {
        ujx.mo27609f(((Boolean) obj).booleanValue());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo28106a(ujx ujx, ukt ukt, long j) {
        ula n = ukt.mo27674n();
        if (!n.mo27683a()) {
            n.mo27682a(Boolean.valueOf(ujx.mo27547Y()), j);
        } else {
            n.mo27680a(j);
        }
    }
}
