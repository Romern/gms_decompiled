package p000;

import java.util.Deque;

/* renamed from: kmo */
final /* synthetic */ class kmo implements bmxj {

    /* renamed from: a */
    private final Deque f24476a;

    public kmo(Deque deque) {
        this.f24476a = deque;
    }

    public final Object apply(Object obj) {
        kjy kjy;
        int i;
        int i2;
        Deque deque = this.f24476a;
        kom kom = (kom) obj;
        kjy kjy2 = kmr.f24479a;
        kjy kjy3 = (kjy) deque.peek();
        if (kjy3 == null) {
            kjy3 = new kjy(0, 0, kom.f24615n, kom.f24614m);
        }
        if (kjy3.mo14553a()) {
            kjy = kmr.f24479a;
        } else {
            if (kom.f24611j == 0) {
                if (kom.f24623v != null) {
                    kjy = kmr.f24480b;
                } else {
                    int i3 = kom.f24615n;
                    if (!(i3 == 0 || (i = kom.f24614m) == 0)) {
                        int i4 = kom.f24612k;
                        int i5 = kom.f24613l;
                        kjy kjy4 = new kjy(i4, i5, i3 + i4, i + i5);
                        kmr.m18175a(kjy4);
                        int i6 = kjy4.f24285a;
                        if (i6 >= kjy3.f24287c || (i2 = kjy3.f24285a) >= kjy4.f24287c || kjy4.f24286b >= kjy3.f24288d || kjy3.f24286b >= kjy4.f24288d) {
                            kjy = kmr.f24479a;
                        } else {
                            kjy4.f24285a = Math.max(i6, i2);
                            kjy4.f24286b = Math.max(kjy4.f24286b, kjy3.f24286b);
                            kjy4.f24287c = Math.min(kjy4.f24287c, kjy3.f24287c);
                            int min = Math.min(kjy4.f24288d, kjy3.f24288d);
                            kjy4.f24288d = min;
                            int i7 = (-kom.f24612k) + kom.f24616o;
                            int i8 = (-kom.f24613l) + kom.f24617p;
                            kjy4.f24285a += i7;
                            kjy4.f24286b += i8;
                            kjy4.f24287c += i7;
                            kjy4.f24288d = min + i8;
                            kmr.m18175a(kjy4);
                            kjy = kjy4;
                        }
                    }
                }
            }
            kjy = kmr.f24479a;
        }
        deque.push(kjy);
        return Boolean.valueOf(!kjy.mo14553a());
    }
}
