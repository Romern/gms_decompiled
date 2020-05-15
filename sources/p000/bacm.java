package p000;

import java.util.Collections;
import java.util.List;

/* renamed from: bacm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bacm extends cazu {

    /* renamed from: b */
    private final cazn f100474b;

    /* renamed from: c */
    private final cazn f100475c;

    private bacm(cijl cijl, cijl cijl2, cazn cazn, cazn cazn2) {
        super(cijl2, cbag.m127657a(bacm.class), cijl);
        this.f100474b = cbac.m127643a(cazn);
        this.f100475c = cbac.m127643a(cazn2);
    }

    /* renamed from: a */
    public static bacm m86569a(cijl cijl, cijl cijl2, cazn cazn, cazn cazn2) {
        return new bacm(cijl, cijl2, cazn, cazn2);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ bqgg mo14449b(Object obj) {
        Object emptyList;
        List list = (List) obj;
        int i = 0;
        bygz bygz = (bygz) list.get(1);
        bxwc bxwc = ((bygw) list.get(0)).f166400a;
        int size = bxwc.size();
        while (true) {
            if (i < size) {
                bygv bygv = (bygv) bxwc.get(i);
                bygz bygz2 = bygv.f166392c;
                if (bygz2 == null) {
                    bygz2 = bygz.f166410c;
                }
                i++;
                if (bygz.equals(bygz2)) {
                    emptyList = bygv.f166394e;
                    break;
                }
            } else {
                emptyList = Collections.emptyList();
                break;
            }
        }
        return bqga.m112775a(emptyList);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final bqgg mo14448a() {
        return bqga.m112779a(this.f100474b.mo75201b(), this.f100475c.mo75201b());
    }
}
