package p000;

import com.google.android.gms.appdatasearch.SuggestionResults;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: fsv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fsv implements Iterator {

    /* renamed from: a */
    final /* synthetic */ SuggestionResults f17200a;

    /* renamed from: b */
    private int f17201b = 0;

    public fsv(SuggestionResults suggestionResults) {
        this.f17200a = suggestionResults;
    }

    public final boolean hasNext() {
        return this.f17201b < this.f17200a.f9692b.length;
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        if (hasNext()) {
            this.f17201b++;
            return new fsu();
        }
        throw new NoSuchElementException();
    }
}
