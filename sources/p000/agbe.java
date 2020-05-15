package p000;

import android.content.Context;
import com.google.android.gms.mdns.MdnsSearchOptions;

/* renamed from: agbe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class agbe extends agbf {

    /* renamed from: a */
    final /* synthetic */ agbh f65118a;

    /* renamed from: b */
    final /* synthetic */ MdnsSearchOptions f65119b;

    /* renamed from: c */
    final /* synthetic */ agbi f65120c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public agbe(agbi agbi, String str, agbh agbh, MdnsSearchOptions mdnsSearchOptions) {
        super(str);
        this.f65120c = agbi;
        this.f65118a = agbh;
        this.f65119b = mdnsSearchOptions;
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        agbi agbi = this.f65120c;
        agbi.f65127c.mo35135a(agbi.f65126b, this.f65118a, this.f65119b);
    }
}
