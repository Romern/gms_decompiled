package p000;

import android.content.ContentValues;
import android.database.Cursor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: ukt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ukt extends uny {

    /* renamed from: a */
    public final ukk f48053a;

    /* renamed from: b */
    public List f48054b;

    /* renamed from: c */
    public ula f48055c;

    /* renamed from: d */
    public ula f48056d;

    /* renamed from: e */
    public ula f48057e;

    /* renamed from: f */
    private Map f48058f;

    /* renamed from: g */
    private Map f48059g;

    /* renamed from: h */
    private Map f48060h;

    public ukt(uno uno, ukk ukk, long j) {
        super(uno, uld.f48108a, j);
        this.f48054b = new ArrayList();
        this.f48058f = new HashMap();
        this.f48059g = new HashMap();
        this.f48060h = new HashMap();
        this.f48055c = null;
        this.f48056d = null;
        this.f48057e = null;
        sdo.m34959a(ukk);
        this.f48053a = ukk;
        m38872a(ulc.STARRED_VALUE, ulc.STARRED_ACTION_ID);
        m38872a(ulc.VIEWED_VALUE, ulc.VIEWED_ACTION_ID);
        m38872a(ulc.IN_DRIVE_SPACE_VALUE, ulc.IN_DRIVE_SPACE_ACTION_ID);
        m38872a(ulc.CAN_EDIT_VALUE, ulc.CAN_EDIT_ACTION_ID);
        m38872a(ulc.SHARED_VALUE, ulc.SHARED_ACTION_ID);
        m38872a(ulc.WRITERS_CAN_SHARE_VALUE, ulc.WRITERS_CAN_SHARE_ACTION_ID);
        m38873b(ulc.CREATION_DATE_VALUE, ulc.CREATION_DATE_ACTION_ID);
        m38873b(ulc.LAST_MODIFIED_DATE_VALUE, ulc.LAST_MODIFIED_DATE_ACTION_ID);
        m38873b(ulc.LAST_VIEWED_BY_ME_DATE_VALUE, ulc.LAST_VIEWED_BY_ME_DATE_ACTION_ID);
        m38873b(ulc.MODIFIED_BY_ME_DATE_VALUE, ulc.MODIFIED_BY_ME_DATE_ACTION_ID);
        m38873b(ulc.SHARED_WITH_ME_DATE_VALUE, ulc.SHARED_WITH_ME_DATE_ACTION_ID);
        m38874c(ulc.DESCRIPTION_VALUE, ulc.DESCRIPTION_ACTION_ID);
        m38874c(ulc.FOLDER_COLOR_RGB_VALUE, ulc.FOLDER_COLOR_RGB_ACTION_ID);
        m38874c(ulc.MIME_TYPE_VALUE, ulc.MIME_TYPE_ACTION_ID);
        m38874c(ulc.TITLE_VALUE, ulc.TITLE_ACTION_ID);
        m38874c(ulc.USER_ROLE_VALUE, ulc.USER_ROLE_ACTION_ID);
        ula d = ula.m38907d(ulc.TRASHED_VALUE, ulc.TRASHED_ACTION_ID);
        this.f48055c = d;
        this.f48054b.add(d);
        ula e = ula.m38908e(ulc.QUOTA_BYTES_USED_VALUE, ulc.QUOTA_BYTES_USED_ACTION_ID);
        this.f48056d = e;
        this.f48054b.add(e);
        ula f = ula.m38909f(ulc.OWNER_NAMES_VALUE, ulc.OWNER_NAMES_ACTION_ID);
        this.f48057e = f;
        this.f48054b.add(f);
    }

    /* renamed from: a */
    public static ukt m38871a(uno uno, Cursor cursor) {
        return new ukt(uno, ukk.m38862a(ulc.ENTRY_ID.f48107O.mo27705b(cursor).longValue()), cursor);
    }

    /* renamed from: b */
    private final void m38873b(ulc ulc, ulc ulc2) {
        ula b = ula.m38905b(ulc, ulc2);
        this.f48059g.put(ulc, b);
        this.f48054b.add(b);
    }

    /* renamed from: c */
    private final void m38874c(ulc ulc, ulc ulc2) {
        ula c = ula.m38906c(ulc, ulc2);
        this.f48060h.put(ulc, c);
        this.f48054b.add(c);
    }

    /* renamed from: d */
    public final ula mo27664d() {
        return (ula) this.f48060h.get(ulc.TITLE_VALUE);
    }

    /* renamed from: e */
    public final ula mo27665e() {
        return (ula) this.f48060h.get(ulc.USER_ROLE_VALUE);
    }

    /* renamed from: f */
    public final ula mo27666f() {
        return (ula) this.f48058f.get(ulc.STARRED_VALUE);
    }

    /* renamed from: g */
    public final ula mo27667g() {
        return (ula) this.f48060h.get(ulc.DESCRIPTION_VALUE);
    }

    /* renamed from: h */
    public final ula mo27668h() {
        return (ula) this.f48059g.get(ulc.LAST_VIEWED_BY_ME_DATE_VALUE);
    }

    /* renamed from: i */
    public final ula mo27669i() {
        return (ula) this.f48058f.get(ulc.VIEWED_VALUE);
    }

    /* renamed from: j */
    public final ula mo27670j() {
        return (ula) this.f48058f.get(ulc.IN_DRIVE_SPACE_VALUE);
    }

    /* renamed from: k */
    public final ula mo27671k() {
        return (ula) this.f48058f.get(ulc.CAN_EDIT_VALUE);
    }

    /* renamed from: l */
    public final ula mo27672l() {
        return (ula) this.f48058f.get(ulc.SHARED_VALUE);
    }

    /* renamed from: m */
    public final ula mo27673m() {
        return (ula) this.f48059g.get(ulc.SHARED_WITH_ME_DATE_VALUE);
    }

    /* renamed from: n */
    public final ula mo27674n() {
        return (ula) this.f48058f.get(ulc.WRITERS_CAN_SHARE_VALUE);
    }

    /* renamed from: o */
    public final ula mo27675o() {
        return (ula) this.f48059g.get(ulc.LAST_MODIFIED_DATE_VALUE);
    }

    /* renamed from: p */
    public final ula mo27676p() {
        return (ula) this.f48059g.get(ulc.MODIFIED_BY_ME_DATE_VALUE);
    }

    /* renamed from: q */
    public final ula mo27677q() {
        return (ula) this.f48059g.get(ulc.CREATION_DATE_VALUE);
    }

    public final String toString() {
        return String.format(Locale.US, "GenoaValues [entrySpec=%s]", this.f48053a);
    }

    /* renamed from: a */
    private final void m38872a(ulc ulc, ulc ulc2) {
        ula a = ula.m38904a(ulc, ulc2);
        this.f48058f.put(ulc, a);
        this.f48054b.add(a);
    }

    /* renamed from: b */
    public final ula mo27662b() {
        return (ula) this.f48060h.get(ulc.FOLDER_COLOR_RGB_VALUE);
    }

    /* renamed from: c */
    public final ula mo27663c() {
        return (ula) this.f48060h.get(ulc.MIME_TYPE_VALUE);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo27511a(ContentValues contentValues) {
        List list = this.f48054b;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((ula) list.get(i)).mo27685b(contentValues);
        }
        contentValues.put(ulc.ENTRY_ID.f48107O.mo27700a(), Long.valueOf(this.f48053a.f47941a));
    }

    private ukt(uno uno, ukk ukk, Cursor cursor) {
        this(uno, ukk, uld.f48108a.f48341a.mo27705b(cursor).longValue());
        List list = this.f48054b;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((ula) list.get(i)).mo27686b(cursor);
        }
    }
}
