package p000;

import android.content.ContentValues;
import com.google.android.gms.plus.service.v2whitelisted.models.Mergedpeoplemetadata;
import com.google.android.gms.plus.service.v2whitelisted.models.Person;
import java.util.List;

/* renamed from: amep */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class amep extends ameo {
    /* renamed from: a */
    private static final void m62791a(ContentValues contentValues, Person.Emails emails) {
        contentValues.put("affinity1", Double.valueOf(amdx.m62686a(emails.f83232d, "emailAutocomplete")));
        contentValues.put("logging_id", amdx.m62698b(emails.f83232d, "emailAutocomplete"));
        contentValues.putNull("affinity2");
        contentValues.putNull("affinity3");
        contentValues.putNull("affinity4");
        contentValues.putNull("affinity5");
        contentValues.putNull("logging_id2");
        contentValues.putNull("logging_id3");
        contentValues.putNull("logging_id4");
        contentValues.putNull("logging_id5");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo41157a() {
        return 1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo41163b(almm almm) {
        almm.f73769q++;
    }

    public amep(ames ames) {
        super(ames);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo41164b(ContentValues contentValues, Object obj) {
        m62791a(contentValues, (Person.Emails) obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ String mo41158a(Object obj) {
        return ((Person.Emails) obj).f83234f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo41161a(almm almm) {
        almm.f73768p++;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo41162a(ContentValues contentValues, Object obj) {
        Person.Emails emails = (Person.Emails) obj;
        contentValues.put("value", emails.f83234f);
        contentValues.put("value_type", Integer.valueOf(amdx.m62688a(emails)));
        contentValues.put("custom_label", emails.f83233e);
        m62791a(contentValues, emails);
        List list = emails.f83230b;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Person.Emails.Certificates certificates = (Person.Emails.Certificates) list.get(i);
                Mergedpeoplemetadata mergedpeoplemetadata = certificates.f83237b;
                if (mergedpeoplemetadata != null && mergedpeoplemetadata.f83125j) {
                    contentValues.put("certificate_expiration_millis", Long.valueOf(certificates.f83238c.f83243d * 1000));
                    contentValues.put("certificate_status", certificates.f83238c.f83241b);
                    return;
                }
            }
        }
    }
}
