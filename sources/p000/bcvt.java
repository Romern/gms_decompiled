package p000;

import android.content.Context;
import android.net.Uri;
import com.google.android.libraries.messaging.lighter.model.ContactId;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: bcvt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bcvt implements bcve {

    /* renamed from: a */
    static final AtomicBoolean f105022a = new AtomicBoolean(false);

    /* renamed from: b */
    public final Context f105023b;

    /* renamed from: c */
    public final bcwe f105024c;

    /* renamed from: d */
    public final String f105025d;

    /* renamed from: e */
    public final String f105026e;

    /* renamed from: f */
    public final bbyw f105027f;

    /* renamed from: g */
    public final bqgj f105028g = bboz.m88304a().f103024a;

    /* renamed from: h */
    public final bqgj f105029h;

    /* renamed from: i */
    public final bcws f105030i;

    /* renamed from: j */
    private final File f105031j;

    /* renamed from: k */
    private final File f105032k;

    /* renamed from: l */
    private final File f105033l;

    /* renamed from: m */
    private final File f105034m;

    /* renamed from: n */
    private boolean f105035n = false;

    public bcvt(Context context, bcwe bcwe, bbyw bbyw, String str, bcws bcws) {
        this.f105023b = context;
        this.f105024c = bcwe;
        this.f105025d = str;
        this.f105026e = new File(str).getName();
        this.f105027f = bbyw;
        bcfx.m88929a(context);
        this.f105029h = bqgs.m112811a(Executors.newSingleThreadExecutor());
        this.f105030i = bcws;
        String str2 = File.separator;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(str2);
        sb.append("tmp");
        this.f105031j = new File(sb.toString());
        String str3 = File.separator;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 6 + String.valueOf(str3).length());
        sb2.append(str);
        sb2.append(str3);
        sb2.append("photos");
        this.f105032k = new File(sb2.toString());
        String absolutePath = this.f105032k.getAbsolutePath();
        String str4 = File.separator;
        StringBuilder sb3 = new StringBuilder(String.valueOf(absolutePath).length() + 6 + String.valueOf(str4).length());
        sb3.append(absolutePath);
        sb3.append(str4);
        sb3.append("images");
        this.f105033l = new File(sb3.toString());
        String absolutePath2 = this.f105033l.getAbsolutePath();
        String str5 = File.separator;
        StringBuilder sb4 = new StringBuilder(String.valueOf(absolutePath2).length() + 3 + String.valueOf(str5).length());
        sb4.append(absolutePath2);
        sb4.append(str5);
        sb4.append("tmp");
        this.f105034m = new File(sb4.toString());
    }

    /* renamed from: a */
    public static String m90115a(ContactId contactId) {
        try {
            return m90118b(contactId);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("Unexpected encoding exception", e);
        }
    }

    /* renamed from: b */
    public static String m90118b(ContactId contactId) {
        String a = contactId.mo60492a();
        String b = contactId.mo60493b();
        StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 1 + String.valueOf(b).length());
        sb.append(a);
        sb.append("_");
        sb.append(b);
        return URLEncoder.encode(sb.toString(), "UTF-8");
    }

    /* renamed from: b */
    public final File mo57603b() {
        String str = this.f105025d;
        String str2 = File.separator;
        String str3 = File.separator;
        String str4 = this.f105026e;
        String str5 = File.separator;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        int length3 = String.valueOf(str3).length();
        StringBuilder sb = new StringBuilder(length + 6 + length2 + length3 + String.valueOf(str4).length() + String.valueOf(str5).length());
        sb.append(str);
        sb.append(str2);
        sb.append("photos");
        sb.append(str3);
        sb.append(str4);
        sb.append(str5);
        return new File(sb.toString());
    }

    /* renamed from: a */
    public static String m90116a(ConversationId conversationId) {
        try {
            chus chus = chus.OK;
            ConversationId.IdType idType = ConversationId.IdType.ONE_TO_ONE;
            int ordinal = conversationId.mo60556c().ordinal();
            if (ordinal == 0) {
                return m90118b(conversationId.mo60558e());
            }
            if (ordinal != 1) {
                return "";
            }
            String a = conversationId.mo60557d().mo60503a();
            String b = conversationId.mo60557d().mo60504b();
            StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 1 + String.valueOf(b).length());
            sb.append(a);
            sb.append("_");
            sb.append(b);
            return URLEncoder.encode(sb.toString(), "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("Unexpected encoding exception", e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final String mo57604b(ConversationId conversationId, String str) {
        String absolutePath = this.f105034m.getAbsolutePath();
        String str2 = File.separator;
        String a = m90116a(conversationId);
        String str3 = File.separator;
        String valueOf = String.valueOf(bnzi.m110902d().mo68721a(str, bmwy.f131158c));
        int length = String.valueOf(absolutePath).length();
        int length2 = String.valueOf(str2).length();
        int length3 = String.valueOf(a).length();
        StringBuilder sb = new StringBuilder(length + length2 + length3 + String.valueOf(str3).length() + String.valueOf(valueOf).length());
        sb.append(absolutePath);
        sb.append(str2);
        sb.append(a);
        sb.append(str3);
        sb.append(valueOf);
        return sb.toString();
    }

    /* renamed from: a */
    public static final String m90117a(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd", Locale.US);
        bbon.m88284a();
        String format = simpleDateFormat.format(new Date(System.currentTimeMillis()));
        StringBuilder sb = new StringBuilder(String.valueOf(format).length() + 5 + String.valueOf(str).length());
        sb.append(format);
        sb.append("_");
        sb.append(str);
        sb.append(".jpg");
        return sb.toString();
    }

    /* renamed from: a */
    public final bqgg mo57590a(bcoh bcoh, bctr bctr) {
        bmxv a = bcva.m90099a(bctr);
        if (!a.mo66813a()) {
            bbos.m88293c("PhotosMsgController", "Attempted to download a non-photo message");
            return bqga.m112777a((Throwable) new IOException("Cannot download non-photo message"));
        }
        bcwr bcwr = (bcwr) a.mo66814b();
        if (bcwr.mo57622a() == null) {
            bbos.m88293c("PhotosMsgController", "Attempted to download image with no media id");
            return bqga.m112777a((Throwable) new IOException("Cannot download an image without a media ID"));
        } else if (bcwr.mo57629g() == 2) {
            bbos.m88293c("PhotosMsgController", "Attempted to download an image with a permanent failure");
            return bqga.m112777a((Throwable) new IOException("Cannot download an image marked as DOWNLOAD_PERMANENT_FAILURE"));
        } else {
            bqgg b = this.f105028g.mo25819b(new bcvo(this));
            String str = this.f105025d;
            String str2 = File.separator;
            String str3 = File.separator;
            String a2 = m90117a(bctr.mo57359a());
            int length = String.valueOf(str).length();
            int length2 = String.valueOf(str2).length();
            StringBuilder sb = new StringBuilder(length + 3 + length2 + String.valueOf(str3).length() + String.valueOf(a2).length());
            sb.append(str);
            sb.append(str2);
            sb.append("tmp");
            sb.append(str3);
            sb.append(a2);
            String sb2 = sb.toString();
            bqgg a3 = bqdx.m112674a(b, new bcvp(this, bcwr, bcoh, bctr, sb2), this.f105028g);
            bqga.m112781a(a3, new bcvs(this, bcwr, bctr, bcoh), this.f105028g);
            return bqdx.m112673a(a3, new bcvq(this, sb2, bctr, bcwr, bcoh), this.f105028g);
        }
    }

    /* renamed from: a */
    public final bqgg mo57591a(bcoh bcoh, bctr bctr, bcvd bcvd) {
        bcwp a = bcvd.mo57585a();
        File file = new File(mo57600a(bctr.mo57361c(), a.mo57617a()));
        if (file.exists()) {
            return bqga.m112775a(Uri.fromFile(file).toString());
        }
        return bqdx.m112673a(bqdx.m112674a(bqfl.m112747c(this.f105028g.mo25819b(new bcvr(this))), new bcvi(this, bcoh, a, bctr, bcvd), this.f105028g), new bcvj(this, bctr, a), this.f105028g);
    }

    /* renamed from: a */
    public final InputStream mo57599a(Uri uri) {
        return this.f105023b.getContentResolver().openInputStream(uri);
    }

    /* renamed from: a */
    public final String mo57600a(ConversationId conversationId, String str) {
        String absolutePath = this.f105033l.getAbsolutePath();
        String str2 = File.separator;
        String a = m90116a(conversationId);
        String str3 = File.separator;
        String valueOf = String.valueOf(bnzi.m110902d().mo68721a(str, bmwy.f131158c));
        int length = String.valueOf(absolutePath).length();
        int length2 = String.valueOf(str2).length();
        int length3 = String.valueOf(a).length();
        StringBuilder sb = new StringBuilder(length + length2 + length3 + String.valueOf(str3).length() + String.valueOf(valueOf).length());
        sb.append(absolutePath);
        sb.append(str2);
        sb.append(a);
        sb.append(str3);
        sb.append(valueOf);
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo57601a() {
        if (!((Boolean) bbqt.m88417a(this.f105023b).f103152au.mo58455c()).booleanValue()) {
            throw new IOException("Failed Photo Operation: photos is disabled by Phenotype flags");
        } else if (!this.f105035n) {
            if (!f105022a.getAndSet(true)) {
                if (!mo57602a(this.f105031j, (String) null)) {
                    bbos.m88294d("PhotosMsgController", "Failed to delete temporary photos directory");
                }
                if (!mo57602a(this.f105034m, (String) null)) {
                    bbos.m88294d("PhotosMsgController", "Failed to delete temporary images directory");
                }
            }
            if (!this.f105031j.exists()) {
                if (this.f105031j.mkdirs()) {
                    String str = this.f105025d;
                    String str2 = File.separator;
                    String str3 = File.separator;
                    int length = String.valueOf(str).length();
                    StringBuilder sb = new StringBuilder(length + 11 + String.valueOf(str2).length() + String.valueOf(str3).length());
                    sb.append(str);
                    sb.append(str2);
                    sb.append("tmp");
                    sb.append(str3);
                    sb.append(".nomedia");
                    if (!new File(sb.toString()).createNewFile()) {
                        throw new IOException("Failed to create tmp dir file");
                    }
                } else {
                    throw new IOException("Failed to create photo tmp dir");
                }
            }
            if (!this.f105032k.exists()) {
                if (!this.f105032k.mkdirs()) {
                    throw new IOException("Failed to create photo dir");
                }
            }
            if (!this.f105034m.exists()) {
                if (this.f105034m.mkdirs()) {
                    String absolutePath = this.f105034m.getAbsolutePath();
                    String str4 = File.separator;
                    StringBuilder sb2 = new StringBuilder(String.valueOf(absolutePath).length() + 8 + String.valueOf(str4).length());
                    sb2.append(absolutePath);
                    sb2.append(str4);
                    sb2.append(".nomedia");
                    if (!new File(sb2.toString()).createNewFile()) {
                        throw new IOException("Failed to create temporary images directory file");
                    }
                } else {
                    throw new IOException("Failed to create temporary images dir");
                }
            }
            if (!this.f105033l.exists()) {
                if (!this.f105033l.mkdirs()) {
                    throw new IOException("Failed to create images directory");
                }
            }
            this.f105035n = true;
        }
    }

    /* renamed from: a */
    public final boolean mo57602a(File file, String str) {
        String name = file.getCanonicalFile().getName();
        if (!file.exists()) {
            return true;
        }
        if (file.isDirectory()) {
            String[] list = file.list();
            if (list == null) {
                return false;
            }
            for (String str2 : list) {
                if (!name.equals(new File(file, str2).getCanonicalFile().getParentFile().getName())) {
                    if (!new File(file, str2).delete()) {
                        return false;
                    }
                } else if ((str == null || str2.startsWith(str)) && !mo57602a(new File(file, str2), str)) {
                    return false;
                }
            }
        }
        if (str == null || file.getName().startsWith(str)) {
            return file.delete();
        }
        return true;
    }
}
