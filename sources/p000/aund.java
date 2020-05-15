package p000;

import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.MatrixCursor;
import java.util.List;
import java.util.Map;

/* renamed from: aund */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class aund extends auna {
    public aund(Context context, aumm aumm) {
        super(context, aumm);
    }

    /* renamed from: a */
    public abstract SharedPreferences mo50695a();

    /* renamed from: a */
    public final Cursor mo50690a(String str) {
        MatrixCursor b = mo50698b();
        auml c = mo50700c(str);
        if (c != null) {
            aumo.m77316a(this.f92125b, b.newRow(), c);
        }
        return b;
    }

    /* renamed from: a */
    public abstract String mo50696a(aumy aumy, String str);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final MatrixCursor mo50698b() {
        aumy[] b = this.f92125b.mo50669b();
        int length = b.length;
        String[] strArr = new String[(length + 1)];
        int i = 0;
        strArr[0] = "__id__";
        while (i < length) {
            int i2 = i + 1;
            strArr[i2] = b[i].f92120a;
            i = i2;
        }
        return new MatrixCursor(strArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract List mo50699b(Map map);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final auml mo50700c(String str) {
        SharedPreferences a = mo50695a();
        ContentValues contentValues = new ContentValues();
        aumy[] b = this.f92125b.mo50669b();
        boolean z = false;
        for (aumy aumy : b) {
            String a2 = mo50696a(aumy, str);
            if (a.contains(a2)) {
                z = true;
            }
            aumw aumw = aumy.f92122c;
            aumw.mo50689b(contentValues, aumy.f92120a, aumw.mo50685a(a, a2));
        }
        if (z) {
            return this.f92125b.mo50666a(str, contentValues);
        }
        return null;
    }

    /* renamed from: a */
    public final Cursor mo50691a(Map map) {
        List<auml> b = mo50699b(map);
        MatrixCursor b2 = mo50698b();
        for (auml auml : b) {
            MatrixCursor.RowBuilder newRow = b2.newRow();
            aumo.m77316a(this.f92125b, newRow, auml);
        }
        return b2;
    }

    /* renamed from: a */
    public final void mo50693a(String str, ContentValues contentValues) {
        auml a = this.f92125b.mo50666a(str, contentValues);
        SharedPreferences.Editor edit = mo50695a().edit();
        ContentValues a2 = a.mo50670a();
        aumy[] b = this.f92125b.mo50669b();
        for (aumy aumy : b) {
            aumw aumw = aumy.f92122c;
            aumw.mo50687a(edit, mo50696a(aumy, a.f92085d), aumw.mo50684a(a2, aumy.f92120a, (Object) null));
        }
        edit.commit();
        mo50692a(1, str);
    }

    /* renamed from: b */
    public final void mo50694b(String str) {
        SharedPreferences.Editor edit = mo50695a().edit();
        for (aumy aumy : this.f92125b.mo50669b()) {
            edit.remove(mo50696a(aumy, str));
        }
        edit.commit();
        mo50692a(2, str);
    }
}
