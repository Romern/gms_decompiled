package p000;

import com.google.android.gms.drive.internal.model.File;

/* renamed from: uws */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class uws extends uxv {
    public uws(uvy uvy) {
        super(uvy, true, null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo28099a(ujx ujx, String str) {
        return Boolean.valueOf(ujx.mo27543U());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo28100a(File file, Object obj) {
        Boolean bool = (Boolean) obj;
        if (file.f31004v == null) {
            file.mo18239a(new File.Labels());
        }
        File.Labels labels = file.f31004v;
        labels.f31017e = bool.booleanValue();
        labels.f31013a.add(6);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo28101a(ujx ujx, String str, Object obj, long j) {
        ujx.mo27600d(((Boolean) obj).booleanValue());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo28106a(ujx ujx, ukt ukt, long j) {
        ula i = ukt.mo27669i();
        if (!i.mo27683a()) {
            i.mo27682a(Boolean.valueOf(ujx.mo27543U()), j);
        } else {
            i.mo27680a(j);
        }
    }
}
