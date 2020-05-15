package p000;

import android.content.Context;
import android.text.format.Time;
import com.felicanetworks.mfc.C0126R;

/* renamed from: vod */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vod {

    /* renamed from: a */
    static final vod f49630a = new vod(vgg.f49231b, C0126R.string.drive_doclist_date_modified_label);

    /* renamed from: b */
    static final vod f49631b = new vod(vgg.f49232c, C0126R.string.drive_doclist_date_edited_label);

    /* renamed from: c */
    static final vod f49632c = new vod(vgg.f49233d, C0126R.string.drive_doclist_date_opened_label);

    /* renamed from: d */
    static final vod f49633d = new vod(vgg.f49234e, C0126R.string.drive_doclist_date_shared_label);

    /* renamed from: e */
    private final uwc f49634e;

    /* renamed from: f */
    private final int f49635f;

    private vod(uwc uwc, int i) {
        this.f49634e = uwc;
        this.f49635f = i;
    }

    /* renamed from: a */
    public final voe mo28686a(Context context) {
        Time time = new Time();
        time.setToNow();
        return new voe(context, time, this.f49634e, this.f49635f);
    }
}
