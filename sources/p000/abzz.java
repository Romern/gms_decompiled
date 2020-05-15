package p000;

import android.content.ContentResolver;
import android.net.Uri;
import android.text.TextUtils;

/* renamed from: abzz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abzz {

    /* renamed from: d */
    private static final String[] f59042d = {"seqno", "action", "uri"};

    /* renamed from: e */
    private static final String[] f59043e = {"created_timestamp", "doc_score", "section_thing_proto"};

    /* renamed from: f */
    private static final String[] f59044f = {"seqno", "action", "uri", "tag"};

    /* renamed from: g */
    private static final String[] f59045g = new String[0];

    /* renamed from: a */
    public final abzy f59046a = new abzy();

    /* renamed from: b */
    public final abzy f59047b = new abzy();

    /* renamed from: c */
    public String f59048c;

    /* renamed from: h */
    private final ContentResolver f59049h;

    /* renamed from: i */
    private boolean f59050i;

    /* renamed from: j */
    private final Uri f59051j;

    /* renamed from: k */
    private final String[] f59052k;

    public abzz(ContentResolver contentResolver, Uri uri, String str, String[] strArr) {
        this.f59049h = contentResolver;
        this.f59051j = uri;
        this.f59048c = str;
        int length = strArr.length;
        String[] strArr2 = f59042d;
        String[] strArr3 = new String[(strArr2.length + length)];
        this.f59052k = strArr3;
        System.arraycopy(strArr2, 0, strArr3, 0, strArr2.length);
        System.arraycopy(strArr, 0, this.f59052k, f59042d.length, length);
    }

    /* renamed from: a */
    private final void m48742a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (TextUtils.isEmpty(this.f59048c)) {
            this.f59048c = str;
        } else if (!str.equals(this.f59048c)) {
            throw new acah(this.f59048c, str);
        }
    }

    /* renamed from: b */
    private final void m48743b(long j) {
        m48742a(this.f59046a.mo32564a(this.f59049h, this.f59051j, "documents", this.f59052k, f59043e, j, "20"));
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        try {
            if (!this.f59050i) {
                absg.m48191b("Content cursor disposed without a closing");
            }
            mo32572a();
        } finally {
            super.finalize();
        }
    }

    /* renamed from: a */
    public final void mo32572a() {
        this.f59046a.mo32571e();
        this.f59047b.mo32571e();
        this.f59050i = true;
    }

    /* renamed from: a */
    public final void mo32573a(long j) {
        if (this.f59046a.mo32566a()) {
            m48743b(j);
        }
        if (this.f59047b.mo32566a()) {
            m48742a(this.f59047b.mo32564a(this.f59049h, this.f59051j, "tags", f59044f, f59045g, j, "100"));
        }
        if (((Boolean) abzt.f58950bl.mo58455c()).booleanValue() && this.f59046a.mo32566a() && !this.f59047b.mo32566a()) {
            m48743b(j);
            absg.m48208e("In second refillDocumentCursor, last seen seqno: %d, docs seqno: %d, tags seqno: %d", Long.valueOf(j), Long.valueOf(this.f59046a.mo32569c()), Long.valueOf(this.f59047b.mo32569c()));
        }
    }
}
