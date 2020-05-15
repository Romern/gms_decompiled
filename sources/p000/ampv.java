package p000;

import com.google.android.gms.people.service.galprovider.PeopleGalChimeraProvider;
import java.util.concurrent.Callable;

/* renamed from: ampv */
public final /* synthetic */ class ampv implements Callable {

    /* renamed from: a */
    private final PeopleGalChimeraProvider f75693a;

    /* renamed from: b */
    private final String[] f75694b;

    /* renamed from: c */
    private final String f75695c;

    /* renamed from: d */
    private final String f75696d;

    /* renamed from: e */
    private final bxvd f75697e;

    public ampv(PeopleGalChimeraProvider peopleGalChimeraProvider, String[] strArr, String str, String str2, bxvd bxvd) {
        this.f75693a = peopleGalChimeraProvider;
        this.f75694b = strArr;
        this.f75695c = str;
        this.f75696d = str2;
        this.f75697e = bxvd;
    }

    public final Object call() {
        return this.f75693a.mo46471a(this.f75694b, this.f75695c, this.f75696d, 1, this.f75697e);
    }
}
