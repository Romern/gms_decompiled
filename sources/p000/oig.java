package p000;

import com.felicanetworks.mfc.mfi.MfiClientException;
import java.nio.ByteBuffer;

/* renamed from: oig */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class oig extends ojh {

    /* renamed from: a */
    private static final bnsn f37689a = odk.m28481a("CAR.GAL.INPUT");

    /* renamed from: b */
    private final oif f37690b;

    public oig(oif oif, ojm ojm) {
        super(8, oif, ojm, 1);
        this.f37690b = oif;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnsi.a(java.lang.String, java.lang.Object, java.lang.Object, java.lang.Object):void
     arg types: [java.lang.String, java.lang.Integer, java.lang.Integer, int]
     candidates:
      bnsi.a(java.lang.String, java.lang.String, int, java.lang.String):void
      bnsi.a(java.lang.String, java.lang.Object, java.lang.Object, java.lang.Object):void */
    /* renamed from: a */
    private final void m28805a(birc birc) {
        bivr bivr = birc.f121382b;
        if (bivr == null) {
            bivr = bivr.f122036e;
        }
        int size = bivr.f122039b.size();
        if (size != 0) {
            int i = bivr.f122040c;
            if (i >= size) {
                bnsi c = f37689a.mo68388c();
                c.mo68432a("oig", "a", (int) MfiClientException.TYPE_MFICLIENT_REMOTE_ACCESS_FAILED, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                c.mo68425a("Bad InputReport. Expecting %d got %d%d", (Object) Integer.valueOf(size), (Object) Integer.valueOf(i), (Object) 1);
                return;
            }
            this.f37690b.mo21074a(bivr);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnsi.a(java.lang.String, java.lang.Object, java.lang.Object, java.lang.Object):void
     arg types: [java.lang.String, java.lang.Integer, java.lang.Integer, int]
     candidates:
      bnsi.a(java.lang.String, java.lang.String, int, java.lang.String):void
      bnsi.a(java.lang.String, java.lang.Object, java.lang.Object, java.lang.Object):void */
    /* renamed from: b */
    private final void m28806b(birc birc) {
        bivr bivr = birc.f121386f;
        if (bivr == null) {
            bivr = bivr.f122036e;
        }
        int size = bivr.f122039b.size();
        if (size != 0) {
            int i = bivr.f122040c;
            if (i >= size) {
                bnsi c = f37689a.mo68388c();
                c.mo68432a("oig", "b", 166, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                c.mo68425a("Bad TouchPadEvent. Expecting %d got %d%d", (Object) Integer.valueOf(size), (Object) Integer.valueOf(i), (Object) 1);
                return;
            }
            this.f37690b.mo21077b(bivr);
        }
    }

    /* renamed from: b */
    public final void mo22087b(int i) {
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnsi.a(java.lang.String, java.lang.Object, java.lang.Object, java.lang.Object):void
     arg types: [java.lang.String, java.lang.Integer, java.lang.Integer, int]
     candidates:
      bnsi.a(java.lang.String, java.lang.String, int, java.lang.String):void
      bnsi.a(java.lang.String, java.lang.Object, java.lang.Object, java.lang.Object):void */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo22085a(int i, ByteBuffer byteBuffer) {
        if (i == 32769) {
            bxvd da = birc.f121379g.mo74144da();
            da.mo74019a(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining(), bxus.m123744c());
            birc birc = (birc) da.mo74057h();
            if (birc.mo74020aS()) {
                bivr bivr = birc.f121382b;
                if (bivr == null) {
                    bivr = bivr.f122036e;
                }
                int size = bivr.f122039b.size();
                if (size != 0) {
                    int i2 = bivr.f122040c;
                    if (i2 < size) {
                        this.f37690b.mo21074a(bivr);
                    } else {
                        bnsi c = f37689a.mo68388c();
                        c.mo68432a("oig", "a", (int) MfiClientException.TYPE_MFICLIENT_REMOTE_ACCESS_FAILED, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        c.mo68425a("Bad InputReport. Expecting %d got %d%d", (Object) Integer.valueOf(size), (Object) Integer.valueOf(i2), (Object) 1);
                    }
                }
                birp birp = birc.f121383c;
                if (birp == null) {
                    birp = birp.f121441b;
                }
                bxwc bxwc = birp.f121443a;
                int size2 = bxwc.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    biro biro = (biro) bxwc.get(i3);
                    this.f37690b.mo21073a(biro);
                    int i4 = biro.f121436b;
                    boolean z = biro.f121437c;
                }
                if ((birc.f121381a & 32) != 0) {
                    biui biui = birc.f121385e;
                    if (biui == null) {
                        biui = biui.f121791b;
                    }
                    biuh biuh = (biuh) biui.f121793a.get(0);
                    int i5 = biuh.f121787a;
                    if (biuh.f121788b != 0) {
                        this.f37690b.mo21075b(((biuh) biui.f121793a.get(0)).f121787a, ((biuh) biui.f121793a.get(0)).f121788b);
                    }
                }
                bivr bivr2 = birc.f121386f;
                if (bivr2 == null) {
                    bivr2 = bivr.f122036e;
                }
                int size3 = bivr2.f122039b.size();
                if (size3 != 0) {
                    int i6 = bivr2.f122040c;
                    if (i6 >= size3) {
                        bnsi c2 = f37689a.mo68388c();
                        c2.mo68432a("oig", "b", 166, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        c2.mo68425a("Bad TouchPadEvent. Expecting %d got %d%d", (Object) Integer.valueOf(size3), (Object) Integer.valueOf(i6), (Object) 1);
                    } else {
                        this.f37690b.mo21077b(bivr2);
                    }
                }
                if ((birc.f121381a & 16) != 0) {
                    biok biok = birc.f121384d;
                    if (biok == null) {
                        biok = biok.f121053b;
                    }
                    int i7 = ((bioj) biok.f121055a.get(0)).f121049a;
                    int i8 = ((bioj) biok.f121055a.get(0)).f121050b;
                    bxwc bxwc2 = biok.f121055a;
                    int size4 = bxwc2.size();
                    for (int i9 = 0; i9 < size4; i9++) {
                        bioj bioj = (bioj) bxwc2.get(i9);
                        this.f37690b.mo21072a(bioj.f121049a, bioj.f121050b);
                    }
                }
            }
        } else if (i != 32771) {
            bnsi b = f37689a.mo68387b();
            b.mo68432a("oig", "a", 84, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            b.mo68409a("Received invalid message type: %d", i);
        } else {
            int i10 = ((birn) bxvk.m124012a(birn.f121428b, byteBuffer)).f121430a;
        }
    }
}
