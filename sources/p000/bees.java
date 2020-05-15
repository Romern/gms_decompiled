package p000;

import android.net.Uri;
import java.util.concurrent.Callable;

/* renamed from: bees */
final /* synthetic */ class bees implements Callable {

    /* renamed from: a */
    private final beeu f111449a;

    /* renamed from: b */
    private final Uri f111450b;

    /* renamed from: c */
    private final beez f111451c;

    /* renamed from: d */
    private final beer[] f111452d;

    public bees(beeu beeu, Uri uri, beez beez, beer[] beerArr) {
        this.f111449a = beeu;
        this.f111450b = uri;
        this.f111451c = beez;
        this.f111452d = beerArr;
    }

    public final Object call() {
        beeu beeu = this.f111449a;
        return beeu.f111456a.mo60643a(this.f111450b, this.f111451c, this.f111452d);
    }
}
