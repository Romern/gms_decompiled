package p000;

import android.os.Build;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.appdatasearch.GlobalSearchApplicationInfo;

/* renamed from: acnk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acnk {

    /* renamed from: a */
    public static final acnk f60236a;

    /* renamed from: b */
    public static final acnk f60237b = new acnk(acnm.f60247b);

    /* renamed from: c */
    public static final acnk f60238c = new acnk(acnm.f60248c);

    /* renamed from: d */
    public static final acnk f60239d;

    /* renamed from: e */
    public static final bnic f60240e;

    /* renamed from: f */
    public static final bnhe f60241f;

    /* renamed from: g */
    private final acnm f60242g;

    static {
        acnm acnm = acnm.f60246a;
        new GlobalSearchApplicationInfo(null, null, C0126R.string.icing_contacts_corpus_label, C0126R.string.icing_contacts_corpus_description, C0126R.C0127drawable.quantum_ic_contacts_grey600_48, "android.intent.action.VIEW", null, null);
        f60236a = new acnk(acnm);
        acnk acnk = new acnk(acnm.f60249d);
        f60239d = acnk;
        f60240e = bnic.m109492a(f60236a, f60237b, f60238c, acnk);
        bnha bnha = new bnha();
        bnha.mo67695b(f60236a.mo32909a(), "android.permission.READ_CONTACTS");
        bnha.mo67695b(f60237b.mo32909a(), "android.permission.READ_CONTACTS");
        bnha.mo67695b("internal.3p:Event", "android.permission.READ_CALENDAR");
        bnha.mo67695b("internal.3p:Message", "android.permission.READ_SMS");
        bnha.mo67695b(f60238c.mo32909a(), "android.permission.READ_CONTACTS");
        bnha.mo67695b(f60239d.mo32909a(), "android.permission.READ_CONTACTS");
        bnha.mo67695b("sms", "android.permission.READ_SMS");
        int i = Build.VERSION.SDK_INT;
        bnha.mo67695b("internal.3p:MusicAlbum", "android.permission.READ_EXTERNAL_STORAGE");
        bnha.mo67695b("internal.3p:MusicGroup", "android.permission.READ_EXTERNAL_STORAGE");
        bnha.mo67695b("internal.3p:MusicPlaylist", "android.permission.READ_EXTERNAL_STORAGE");
        bnha.mo67695b("internal.3p:MusicRecording", "android.permission.READ_EXTERNAL_STORAGE");
        f60241f = bnha.mo67618b();
    }

    public acnk(acnm acnm) {
        this.f60242g = acnm;
    }

    /* renamed from: a */
    public final String mo32909a() {
        return this.f60242g.mo32918b();
    }

    /* renamed from: b */
    public final ftz mo32910b() {
        return this.f60242g.mo32919c();
    }

    public final String toString() {
        String a = mo32909a();
        StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 16);
        sb.append("InternalCorpus[");
        sb.append(a);
        sb.append("]");
        return sb.toString();
    }
}
