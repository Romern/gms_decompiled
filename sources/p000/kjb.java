package p000;

import android.net.Uri;

/* renamed from: kjb */
final /* synthetic */ class kjb implements aie {

    /* renamed from: a */
    private final kjg f24234a;

    /* renamed from: b */
    private final String f24235b;

    public kjb(kjg kjg, String str) {
        this.f24234a = kjg;
        this.f24235b = str;
    }

    /* renamed from: a */
    public final Object mo753a(aic aic) {
        kjg kjg = this.f24234a;
        String str = this.f24235b;
        bnhe a = kjg.f24241b.mo58526a();
        Uri.Builder buildUpon = Uri.parse("https://maps.googleapis.com/maps/api/place/details/json").buildUpon();
        buildUpon.appendQueryParameter("key", "AIzaSyAxFyW670QJ8fZ0IcYp24Lc78okPRIQVJs");
        buildUpon.appendQueryParameter("place_id", str);
        buildUpon.appendQueryParameter("fields", "adr_address");
        String builder = buildUpon.toString();
        aic.getClass();
        kjc kjc = new kjc(aic);
        aic.getClass();
        kjg.f24240a.add(new kjf(builder, kjc, new kip(aic), a));
        return "PlacesAPIRequest";
    }
}
