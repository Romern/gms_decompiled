package p000;

/* renamed from: baml */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class baml implements bamp {

    /* renamed from: a */
    final bngs f101265a = bngx.m109377j();

    /* renamed from: b */
    ByteString f101266b = null;

    /* renamed from: c */
    long f101267c = this.f101268d;

    /* renamed from: d */
    final /* synthetic */ long f101268d;

    /* renamed from: e */
    final /* synthetic */ bamn f101269e;

    public baml(bamn bamn, long j) {
        this.f101269e = bamn;
        this.f101268d = j;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo55759a(Object obj, Object obj2) {
        try {
            bxxc bxxc = (bxxc) this.f101269e.f101276c.mo73653a((ByteString) obj2);
            if (this.f101267c >= ((long) bxxc.mo74145db())) {
                this.f101267c -= (long) bxxc.mo74145db();
                this.f101266b = (ByteString) obj;
                this.f101265a.mo67668c(bxxc);
                return true;
            }
            ((achw) this.f101269e.f101275b.mo16713a()).mo25414c("Size limit(%d) exceeded, stopping adding rest of changes.", Long.valueOf(this.f101268d));
            return false;
        } catch (bxwf e) {
            ((achw) this.f101269e.f101275b.mo16713a()).mo25418e("Skipping unparsable Change proto:", new Object[0]);
            this.f101266b = (ByteString) obj;
            return true;
        }
    }
}
