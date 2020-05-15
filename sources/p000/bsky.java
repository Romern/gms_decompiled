package p000;

import java.util.Comparator;

/* renamed from: bsky */
final /* synthetic */ class bsky implements Comparator {

    /* renamed from: a */
    static final Comparator f144898a = new bsky();

    private bsky() {
    }

    public final int compare(Object obj, Object obj2) {
        byty byty = (byty) obj2;
        bnny b = bnny.m109908a(bskz.f144899a).mo68163b(bskz.f144900b).mo68163b(bskz.f144901c);
        bytz bytz = ((byty) obj).f167735c;
        if (bytz == null) {
            bytz = bytz.f167736g;
        }
        bytz bytz2 = byty.f167735c;
        if (bytz2 == null) {
            bytz2 = bytz.f167736g;
        }
        return b.compare(bytz, bytz2);
    }
}
