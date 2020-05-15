package p000;

import android.content.ContentValues;
import android.database.Cursor;
import java.util.Collection;
import org.json.JSONException;

/* renamed from: ukz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ukz extends ula {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo27678a(Cursor cursor) {
        try {
            return uzf.m39821a(((unp) this.f48062b.mo27461b()).mo27702a(cursor));
        } catch (JSONException e) {
            ula.f48061a.mo25378c("GenoaValuesField", String.format("Invalid JSON %s string array.", this.f48062b), e);
            return null;
        }
    }

    public ukz(vpj vpj, vpj vpj2) {
        super(vpj, vpj2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo27679a(ContentValues contentValues) {
        contentValues.put(((unp) this.f48062b.mo27461b()).mo27700a(), uzf.m39820a((Collection) this.f48063c));
    }
}
