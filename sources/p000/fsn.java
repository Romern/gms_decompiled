package p000;

import com.google.android.gms.appdatasearch.SearchResults;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* renamed from: fsn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fsn implements Iterator {

    /* renamed from: a */
    protected int f17196a;

    /* renamed from: b */
    public fsl f17197b;

    /* renamed from: c */
    public final Map[] f17198c;

    /* renamed from: d */
    final /* synthetic */ SearchResults f17199d;

    public fsn(SearchResults searchResults) {
        this.f17199d = searchResults;
        this.f17198c = !searchResults.mo7231a() ? new Map[searchResults.f9672i.length] : null;
    }

    /* renamed from: a */
    public final C1001fsm next() {
        if (hasNext()) {
            C1001fsm fsm = new C1001fsm(this.f17199d, this.f17196a, this);
            this.f17196a++;
            return fsm;
        }
        throw new NoSuchElementException();
    }

    public final boolean hasNext() {
        return !this.f17199d.mo7231a() && this.f17196a < this.f17199d.f9670g;
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
