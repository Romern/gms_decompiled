package p000;

import android.content.ContentProviderOperation;
import android.content.ContentValues;
import com.google.android.gms.reminders.UpdateRecurrenceOptions;
import com.google.android.gms.reminders.model.TaskEntity;
import java.util.ArrayList;

/* renamed from: aovz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aovz extends aovg {

    /* renamed from: k */
    private static final blrt f83708k;

    /* renamed from: h */
    private final String f83709h;

    /* renamed from: i */
    private final TaskEntity f83710i;

    /* renamed from: j */
    private final UpdateRecurrenceOptions f83711j;

    static {
        blrq blrq = (blrq) blrt.f127524b.mo74144da();
        blrq.mo66690a(blrs.ARCHIVED);
        blrq.mo66690a(blrs.ARCHIVED_TIME_MS);
        blrq.mo66690a(blrs.ASSISTANCE);
        blrq.mo66690a(blrs.EXTENSIONS);
        blrq.mo66690a(blrs.TITLE);
        f83708k = (blrt) blrq.mo74062i();
    }

    public aovz(aost aost, String str, String str2, String str3, TaskEntity taskEntity, UpdateRecurrenceOptions updateRecurrenceOptions) {
        super(aost, str, str2, "UpdateRecurrence");
        this.f83709h = str3;
        this.f83710i = taskEntity;
        this.f83711j = updateRecurrenceOptions;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo46936a(ArrayList arrayList) {
        long j;
        TaskEntity taskEntity = this.f83710i;
        ContentValues contentValues = new ContentValues();
        aowv.m69738a(contentValues, "archived", taskEntity.f107176f);
        contentValues.put("archived_time_ms", taskEntity.f107175e);
        contentValues.put("assistance", taskEntity.f107188r);
        contentValues.put("extensions", taskEntity.f107186p);
        contentValues.put("title", taskEntity.f107173c);
        UpdateRecurrenceOptions updateRecurrenceOptions = this.f83711j;
        int i = updateRecurrenceOptions.f107053a;
        if (i == 1) {
            j = aoww.m69748b(updateRecurrenceOptions);
        } else {
            j = 0;
        }
        String[] strArr = {String.valueOf(this.f83672d.f83507a), this.f83709h};
        String str = "account_id=? AND recurrence_id=?";
        if (this.f83711j.f107054b) {
            str = aowt.m69729a(str, "recurrence_exceptional=?");
            strArr = aowt.m69731a(strArr, new String[]{"0"});
        }
        if (i == 1) {
            str = aowt.m69729a(str, "due_date_millis>=?");
            strArr = aowt.m69731a(strArr, new String[]{String.valueOf(j)});
            ContentProviderOperation.Builder newAssertQuery = ContentProviderOperation.newAssertQuery(aotd.f83574a);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 24);
            sb.append(str);
            sb.append(" AND recurrence_master=1");
            arrayList.add(newAssertQuery.withSelection(sb.toString(), strArr).withExpectedCount(1).build());
        }
        arrayList.add(ContentProviderOperation.newUpdate(aotd.f83574a).withValues(contentValues).withSelection(str, strArr).build());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo46945b(ArrayList arrayList) {
        bxvd da = blro.f127492g.mo74144da();
        bxvd da2 = blou.f127145c.mo74144da();
        String str = this.f83709h;
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        blou blou = (blou) da2.f164949b;
        str.getClass();
        blou.f127147a |= 1;
        blou.f127148b = str;
        blou blou2 = (blou) da2.mo74062i();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        blro blro = (blro) da.f164949b;
        blou2.getClass();
        blro.f127496c = blou2;
        blro.f127494a |= 2;
        blrt blrt = f83708k;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        blro blro2 = (blro) da.f164949b;
        blrt.getClass();
        blro2.f127497d = blrt;
        blro2.f127494a |= 4;
        blrj a = aoww.m69746a(this.f83710i);
        if (a != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            blro blro3 = (blro) da.f164949b;
            a.getClass();
            blro3.f127498e = a;
            blro3.f127494a |= 8;
        }
        blrb a2 = aoww.m69745a(this.f83711j);
        if (a2 != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            blro blro4 = (blro) da.f164949b;
            a2.getClass();
            blro4.f127499f = a2;
            blro4.f127494a |= 16;
        }
        blrk b = mo46944b();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        blro blro5 = (blro) da.f164949b;
        b.getClass();
        blro5.f127495b = b;
        blro5.f127494a |= 1;
        arrayList.add(mo46934a(6, (blro) da.mo74062i()));
    }
}
