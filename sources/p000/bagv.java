package p000;

import java.util.List;

/* renamed from: bagv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bagv extends cazu {

    /* renamed from: b */
    private final cazn f100839b;

    /* renamed from: c */
    private final cazn f100840c;

    public bagv(cijl cijl, cijl cijl2, cazn cazn, cazn cazn2) {
        super(cijl2, cbag.m127657a(bagv.class), cijl);
        this.f100839b = cbac.m127643a(cazn);
        this.f100840c = cbac.m127643a(cazn2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final bqgg mo14448a() {
        return bqga.m112779a(this.f100839b.mo75201b(), this.f100840c.mo75201b());
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ bqgg mo14449b(Object obj) {
        bygv bygv;
        List list = (List) obj;
        int i = 0;
        bygz bygz = (bygz) list.get(1);
        bxwc bxwc = ((bygw) list.get(0)).f166400a;
        int size = bxwc.size();
        while (true) {
            if (i < size) {
                bygv = (bygv) bxwc.get(i);
                bygz bygz2 = bygv.f166392c;
                if (bygz2 == null) {
                    bygz2 = bygz.f166410c;
                }
                i++;
                if (bygz.equals(bygz2)) {
                    break;
                }
            } else {
                bygv = bygv.f166388h;
                break;
            }
        }
        return bqga.m112775a(bygv);
    }
}
