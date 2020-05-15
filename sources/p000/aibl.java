package p000;

import java.util.List;

/* renamed from: aibl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aibl extends buqn {

    /* renamed from: a */
    final /* synthetic */ List f68605a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aibl(String str, List list) {
        super(str);
        this.f68605a = list;
    }

    public final void run() {
        List list = this.f68605a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((ahsu) list.get(i)).mo37070a(true);
        }
    }
}
