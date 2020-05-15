package p000;

import android.accounts.Account;
import android.content.ContentResolver;
import android.net.Uri;
import android.provider.ContactsContract;
import android.text.TextUtils;

/* renamed from: amyk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amyk {

    /* renamed from: a */
    private final Account f76384a;

    /* renamed from: b */
    private final ContentResolver f76385b;

    public amyk(Account account, ContentResolver contentResolver) {
        this.f76384a = account;
        this.f76385b = contentResolver;
    }

    /* renamed from: a */
    private final int m63724a(String str, long j) {
        Uri a = amvt.m63471a(ContactsContract.RawContactsEntity.CONTENT_URI, this.f76384a);
        StringBuilder sb = new StringBuilder();
        sb.append("mimetype='vnd.android.cursor.item/group_membership' AND data1=?");
        if (!TextUtils.isEmpty(str)) {
            sb.append(" AND  (");
            sb.append(str);
            sb.append(")");
        }
        return amvt.m63469a(this.f76385b, a, sb.toString(), new String[]{String.valueOf(j)});
    }

    /* renamed from: a */
    public final amnh mo41564a(long j) {
        bxvd da = amnh.f75472f.mo74144da();
        int a = m63724a(null, j);
        if (a > 0) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            amnh amnh = (amnh) da.f164949b;
            amnh.f75474a |= 1;
            amnh.f75475b = a;
            int a2 = m63724a(String.format("%s = 1 and %s = 1", "dirty", "deleted"), j);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            amnh amnh2 = (amnh) da.f164949b;
            amnh2.f75474a |= 8;
            amnh2.f75478e = a2;
            int a3 = m63724a(String.format("%s = 1 and %s is null", "dirty", "sourceid"), j);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            amnh amnh3 = (amnh) da.f164949b;
            amnh3.f75474a |= 2;
            amnh3.f75476c = a3;
            int a4 = m63724a(String.format("%s = 1 and %s is not null", "dirty", "sourceid"), j);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            amnh amnh4 = (amnh) da.f164949b;
            amnh4.f75474a |= 4;
            amnh4.f75477d = a4;
            da.mo74062i();
        }
        return (amnh) da.mo74062i();
    }
}
