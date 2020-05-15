package p000;

import android.content.ContentValues;
import com.google.android.gms.plus.service.v2whitelisted.models.Person;

/* renamed from: ameq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ameq extends ameo {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo41157a() {
        return 2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo41163b(almm almm) {
    }

    public ameq(ames ames) {
        super(ames);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ String mo41158a(Object obj) {
        return ((Person.PhoneNumbers) obj).f83389f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo41164b(ContentValues contentValues, Object obj) {
        Person.PhoneNumbers phoneNumbers = (Person.PhoneNumbers) obj;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo41161a(almm almm) {
        almm.f73770r++;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo41162a(ContentValues contentValues, Object obj) {
        Person.PhoneNumbers phoneNumbers = (Person.PhoneNumbers) obj;
        contentValues.put("value", phoneNumbers.f83389f);
        contentValues.put("value2", phoneNumbers.f83385b);
        contentValues.put("value_type", Integer.valueOf(amdx.m62689a(phoneNumbers)));
        contentValues.put("custom_label", phoneNumbers.f83388e);
        contentValues.putNull("affinity1");
        contentValues.putNull("affinity2");
        contentValues.putNull("affinity3");
        contentValues.putNull("affinity4");
        contentValues.putNull("affinity5");
        contentValues.putNull("logging_id");
        contentValues.putNull("logging_id2");
        contentValues.putNull("logging_id3");
        contentValues.putNull("logging_id4");
        contentValues.putNull("logging_id5");
    }
}
