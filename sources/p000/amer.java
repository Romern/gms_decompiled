package p000;

import android.content.ContentValues;
import com.google.android.gms.plus.service.v2whitelisted.models.Person;

/* renamed from: amer */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class amer extends ameo {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo41157a() {
        return 4;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo41163b(almm almm) {
    }

    public amer(ames ames) {
        super(ames);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ String mo41158a(Object obj) {
        return ((Person.Urls) obj).f83426e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo41164b(ContentValues contentValues, Object obj) {
        Person.Urls urls = (Person.Urls) obj;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo41161a(almm almm) {
        almm.f73771s++;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo41162a(ContentValues contentValues, Object obj) {
        contentValues.put("value", ((Person.Urls) obj).f83426e);
    }
}
