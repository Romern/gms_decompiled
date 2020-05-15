package p000;

import android.content.ContentValues;
import java.util.Locale;

/* renamed from: unq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class unq {

    /* renamed from: a */
    private static final sbw f48333a = new sbw("DatabaseRow", "");

    /* renamed from: am */
    public final uno f48334am;

    /* renamed from: an */
    public final unt f48335an;

    /* renamed from: ao */
    public boolean f48336ao;

    protected unq(uno uno, unt unt, boolean z) {
        this.f48334am = uno;
        sdo.m34959a(unt);
        this.f48335an = unt;
        this.f48336ao = z;
    }

    /* renamed from: a */
    public abstract uog mo27514a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo27515b(ContentValues contentValues);

    /* renamed from: c */
    public void mo27722c(long j) {
        this.f48336ao = true;
    }

    /* renamed from: r */
    public final ContentValues mo27723r() {
        String str;
        ContentValues contentValues = new ContentValues();
        try {
            mo27515b(contentValues);
            return contentValues;
        } catch (RuntimeException e) {
            try {
                str = toString();
            } catch (RuntimeException e2) {
                String message = e2.getMessage();
                StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 52);
                sb.append("[additional RuntimeException thrown by toString(): ");
                sb.append(message);
                sb.append("]");
                str = sb.toString();
            }
            f48333a.mo25378c("DatabaseRow", "Error in fillContentValues()", e);
            f48333a.mo25369a("Error in fillContentValues() on %s; partial result: %s", str, contentValues);
            throw e;
        }
    }

    /* renamed from: s */
    public void mo27724s() {
        this.f48336ao = false;
    }

    /* renamed from: t */
    public final void mo27725t() {
        if (this.f48336ao) {
            ((uhj) this.f48334am).mo27474a((uhp) null, this.f48335an, mo27514a(), mo27723r());
            return;
        }
        mo27722c(((uhj) this.f48334am).mo27466a((uhp) null, this.f48335an, mo27723r()));
    }

    public String toString() {
        return String.format(Locale.US, "DatabaseRow[%s, values=%s]", this.f48335an, mo27723r());
    }

    /* renamed from: u */
    public final void mo27726u() {
        sdo.m34970a(this.f48336ao);
        this.f48334am.mo27465a(this.f48335an, mo27514a());
        mo27724s();
    }
}
