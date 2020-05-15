package p000;

import android.net.Uri;
import java.io.FileNotFoundException;
import java.util.ArrayDeque;
import java.util.Collection;

/* renamed from: behu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class behu implements beez {
    private behu() {
    }

    /* renamed from: a */
    public static behu m95068a() {
        return new behu();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnjd.a(java.util.Collection, java.lang.Iterable):boolean
     arg types: [java.util.ArrayDeque, java.lang.Iterable]
     candidates:
      bnjd.a(java.lang.Iterable, int):java.lang.Iterable
      bnjd.a(java.lang.Iterable, bmxj):java.lang.Iterable
      bnjd.a(java.lang.Iterable, java.util.Comparator):java.lang.Iterable
      bnjd.a(java.lang.Iterable, bmxz):boolean
      bnjd.a(java.lang.Iterable, java.lang.Object):boolean
      bnjd.a(java.util.List, bmxz):boolean
      bnjd.a(java.lang.Iterable, java.lang.Class):java.lang.Object[]
      bnjd.a(java.lang.Iterable, java.lang.Object[]):java.lang.Object[]
      bnjd.a(java.util.Collection, java.lang.Iterable):boolean */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo14941a(beey beey) {
        ArrayDeque arrayDeque = new ArrayDeque();
        befa befa = beey.f111467a;
        bnjd.m109582a((Collection) arrayDeque, befa.mo60650f(beey.f111471e.buildUpon().fragment(null).build()));
        long j = 0;
        while (!arrayDeque.isEmpty()) {
            Uri uri = (Uri) arrayDeque.remove();
            if (befa.mo60648d(uri)) {
                bnjd.m109582a((Collection) arrayDeque, befa.mo60650f(uri));
            } else if (befa.mo60647c(uri)) {
                j += befa.mo60649e(uri);
            } else {
                throw new FileNotFoundException(String.format("Child %s could not be opened", uri));
            }
        }
        return Long.valueOf(j);
    }
}
