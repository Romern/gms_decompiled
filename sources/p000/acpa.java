package p000;

import android.content.ContentResolver;
import android.database.Cursor;
import android.provider.CalendarContract;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: acpa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acpa implements acwo {

    /* renamed from: a */
    private static final acow[] f60391a = new acow[0];

    /* renamed from: b */
    private final long f60392b;

    /* renamed from: c */
    private final long f60393c;

    /* renamed from: d */
    private final long f60394d;

    /* renamed from: e */
    private final acoy f60395e;

    /* renamed from: f */
    private acoz f60396f;

    /* renamed from: g */
    private Cursor f60397g;

    /* renamed from: h */
    private Cursor f60398h;

    public acpa(ContentResolver contentResolver, long j) {
        this.f60392b = j;
        this.f60393c = j - ((Long) abzt.f58884aY.mo58455c()).longValue();
        this.f60394d = j + ((Long) abzt.f58885aZ.mo58455c()).longValue();
        Cursor query = contentResolver.query(CalendarContract.Instances.CONTENT_URI.buildUpon().appendPath(Long.toString(this.f60393c)).appendPath(Long.toString(this.f60394d)).build(), acpb.f60399a, "COALESCE(eventStatus,0)<>2", null, "event_id,begin,end");
        this.f60397g = query;
        if (query == null) {
            this.f60395e = null;
            acnv.m49556e("Calendar Instances query failed");
            return;
        }
        query.moveToFirst();
        int min = Math.min(((Integer) abzt.f58939ba.mo58455c()).intValue(), 100);
        if (min > 0) {
            this.f60395e = new acoy(min);
            Cursor query2 = contentResolver.query(CalendarContract.Attendees.CONTENT_URI, acpb.f60400b, "COALESCE(attendeeType,0)<>3", null, "event_id");
            this.f60398h = query2;
            if (query2 == null) {
                acnv.m49556e("Calendar Attendees query failed");
            } else if (!query2.moveToFirst()) {
                this.f60398h.close();
            }
            m49646a();
        }
        this.f60395e = null;
        this.f60398h = null;
        m49646a();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.max(long, long):long}
     arg types: [int, long]
     candidates:
      ClspMth{java.lang.Math.max(double, double):double}
      ClspMth{java.lang.Math.max(int, int):int}
      ClspMth{java.lang.Math.max(float, float):float}
      ClspMth{java.lang.Math.max(long, long):long} */
    /* renamed from: a */
    private final void m49646a() {
        boolean z;
        acow[] acowArr;
        int i;
        int i2;
        while (!this.f60397g.isAfterLast()) {
            Cursor cursor = this.f60397g;
            String[] strArr = acpb.f60399a;
            if (!bmxx.m108577a(cursor.getString(1)) || !bmxx.m108577a(cursor.getString(2))) {
                break;
            }
            this.f60397g.moveToNext();
        }
        if (!this.f60397g.isAfterLast()) {
            acoz acoz = new acoz();
            acoz.f60384a = this.f60397g.getLong(0);
            acoz.f60385b = bmxx.m108579c(this.f60397g.getString(1));
            acoz.f60386c = bmxx.m108579c(this.f60397g.getString(2));
            acoz.f60387d = bmxx.m108579c(this.f60397g.getString(3));
            if (acoz.f60385b == null) {
                acoz.f60385b = acoz.f60386c;
                acoz.f60386c = null;
            }
            if (this.f60397g.getLong(6) > 0) {
                z = true;
            } else {
                z = false;
            }
            acoz.f60388e = Boolean.valueOf(z);
            ArrayList arrayList = new ArrayList();
            while (true) {
                acph acph = new acph();
                acph.f60413a = this.f60397g.getLong(4);
                long j = this.f60397g.getLong(5);
                acph.f60414b = j;
                long j2 = acph.f60413a;
                if (j2 <= j && j2 <= this.f60394d && j >= this.f60393c) {
                    arrayList.add(acph);
                }
                this.f60397g.moveToNext();
                if (this.f60397g.isAfterLast() || this.f60397g.getLong(0) != acoz.f60384a) {
                    long j3 = this.f60392b;
                    acph[] acphArr = (acph[]) arrayList.toArray(new acph[0]);
                    String[] strArr2 = acpb.f60399a;
                    int length = acphArr.length;
                }
            }
            long j32 = this.f60392b;
            acph[] acphArr2 = (acph[]) arrayList.toArray(new acph[0]);
            String[] strArr22 = acpb.f60399a;
            int length2 = acphArr2.length;
            if (length2 > 100) {
                int i3 = 0;
                while (length2 - i3 > 100) {
                    int i4 = length2 - 1;
                    int i5 = length2;
                    int i6 = i4;
                    if (Math.max(0L, j32 - acphArr2[i3].f60414b) >= Math.max(0L, acphArr2[i4].f60413a - j32)) {
                        i3++;
                        length2 = i5;
                    } else {
                        length2 = i6;
                    }
                }
                acphArr2 = (acph[]) Arrays.copyOfRange(acphArr2, i3, length2);
            }
            acoz.f60389f = acphArr2;
            long j4 = acoz.f60384a;
            acoy acoy = this.f60395e;
            if (acoy == null || this.f60398h == null) {
                acowArr = f60391a;
            } else {
                sdo.m34970a(acoy.f60382a.isEmpty());
                sdo.m34970a(!this.f60398h.isAfterLast());
                while (true) {
                    long j5 = this.f60398h.getLong(0);
                    if (j5 > j4) {
                        break;
                    }
                    if (j5 == j4) {
                        acoy acoy2 = this.f60395e;
                        String string = this.f60398h.getString(1);
                        String string2 = this.f60398h.getString(2);
                        if (!this.f60398h.isNull(4)) {
                            i = this.f60398h.getInt(4);
                        } else {
                            i = 0;
                        }
                        if (!this.f60398h.isNull(3)) {
                            i2 = this.f60398h.getInt(3);
                        } else {
                            i2 = 0;
                        }
                        String c = bmxx.m108579c(string);
                        String c2 = bmxx.m108579c(string2);
                        if (c == null) {
                            if (c2 != null) {
                                c = c2;
                            }
                        }
                        acoy2.f60382a.add(new acox(c, c2, i, i2));
                        if (acoy2.f60382a.size() > acoy2.f60383b) {
                            acoy2.f60382a.poll();
                        }
                    }
                    if (!this.f60398h.moveToNext()) {
                        this.f60398h.close();
                        this.f60398h = null;
                        break;
                    }
                }
                acoy acoy3 = this.f60395e;
                acowArr = new acow[acoy3.f60382a.size()];
                Iterator it = acoy3.f60382a.iterator();
                int i7 = 0;
                while (it.hasNext()) {
                    acowArr[i7] = ((acox) it.next()).f60380a;
                    i7++;
                }
                Arrays.sort(acowArr);
                this.f60395e.f60382a.clear();
            }
            acoz.f60390g = acowArr;
            this.f60396f = acoz;
            return;
        }
        close();
    }

    public final void close() {
        Cursor cursor = this.f60398h;
        if (cursor != null) {
            cursor.close();
            this.f60398h = null;
        }
        Cursor cursor2 = this.f60397g;
        if (cursor2 != null) {
            cursor2.close();
            this.f60397g = null;
            this.f60396f = null;
        }
    }

    public final boolean hasNext() {
        return this.f60396f != null;
    }

    public final /* bridge */ /* synthetic */ Object next() {
        acoz acoz = this.f60396f;
        if (acoz != null) {
            m49646a();
            return acoz;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
