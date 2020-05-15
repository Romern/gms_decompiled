package p000;

import android.database.Cursor;
import android.util.Log;
import com.google.android.gms.common.stats.radio.NetworkLatencyContract;
import com.google.android.gms.common.stats.radio.NetworkLatencyDbHelper;
import com.google.android.gms.common.stats.radio.NetworkLatencyEvent;
import com.google.android.gms.common.stats.radio.RadiosTracingLoggerProvider;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: smo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class smo extends smk implements RadiosTracingLoggerProvider.NetworkLatencyLogger {

    /* renamed from: c */
    private static final sqh f44769c = smn.f44768a;

    public smo() {
    }

    public final List getEvents(long j, long j2, int i, int i2) {
        sqj sqj;
        Cursor a;
        Throwable th;
        boolean z;
        if (isNopLogger()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        String[] strArr = {"event_time_ms", NetworkLatencyContract.NetworkLatencyColumns.LATENCY, "network_type", "tag", "device_state", NetworkLatencyContract.NetworkLatencyColumns.SUCCESSFUL};
        String[] strArr2 = {String.valueOf(i), String.valueOf(j), String.valueOf(j2)};
        String valueOf = i2 >= 0 ? String.valueOf(i2) : null;
        try {
            sqj sqj2 = this.f44765b;
            String str = NetworkLatencyContract.NetworkLatencyColumns.SUCCESSFUL;
            a = sqj2.mo25970a(NetworkLatencyContract.NetworkLatencyColumns.TABLE_NAME, strArr, "network_type = ? AND event_time_ms BETWEEN ? AND ?", strArr2, "event_time_ms ASC", valueOf);
            if (a != null) {
                int columnIndexOrThrow = a.getColumnIndexOrThrow("event_time_ms");
                int columnIndexOrThrow2 = a.getColumnIndexOrThrow(NetworkLatencyContract.NetworkLatencyColumns.LATENCY);
                int columnIndexOrThrow3 = a.getColumnIndexOrThrow("network_type");
                int columnIndexOrThrow4 = a.getColumnIndexOrThrow("tag");
                int columnIndexOrThrow5 = a.getColumnIndexOrThrow("device_state");
                int columnIndexOrThrow6 = a.getColumnIndexOrThrow(str);
                while (a.moveToNext()) {
                    long j3 = a.getLong(columnIndexOrThrow);
                    long j4 = a.getLong(columnIndexOrThrow2);
                    int i3 = a.getInt(columnIndexOrThrow3);
                    int i4 = a.getInt(columnIndexOrThrow4);
                    int i5 = a.getInt(columnIndexOrThrow5);
                    if (a.getInt(columnIndexOrThrow6) == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    arrayList.add(new NetworkLatencyEvent(j3, j4, i3, i4, i5, z));
                }
            }
            if (a != null) {
                a.close();
            }
            sqj = this.f44765b;
        } catch (IllegalArgumentException e) {
            try {
                Log.e("tag", "Unable to query radio logs: ", e);
                sqj = this.f44765b;
            } catch (Throwable th2) {
                this.f44765b.mo25971a();
                throw th2;
            }
        } catch (Throwable th3) {
            bqye.m113761a(th, th3);
        }
        sqj.mo25971a();
        return arrayList;
        throw th;
    }

    public smo(NetworkLatencyDbHelper networkLatencyDbHelper, ScheduledExecutorService scheduledExecutorService, long j, TimeUnit timeUnit, int i) {
        super(networkLatencyDbHelper, NetworkLatencyContract.NetworkLatencyColumns.TABLE_NAME, f44769c, scheduledExecutorService, j, timeUnit, i);
    }

    public final List getEvents(long j, long j2, int i, int i2, int i3, int i4) {
        String str;
        sqj sqj;
        Cursor a;
        Throwable th;
        boolean z;
        if (isNopLogger()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        String[] strArr = {"event_time_ms", NetworkLatencyContract.NetworkLatencyColumns.LATENCY, "network_type", "tag", "device_state", NetworkLatencyContract.NetworkLatencyColumns.SUCCESSFUL};
        String[] strArr2 = {String.valueOf(i), String.valueOf(i2), String.valueOf(i3), String.valueOf(j), String.valueOf(j2)};
        if (i4 >= 0) {
            str = String.valueOf(i4);
        } else {
            str = null;
        }
        try {
            a = this.f44765b.mo25970a(NetworkLatencyContract.NetworkLatencyColumns.TABLE_NAME, strArr, "network_type = ? AND tag = ? AND device_state = ? AND event_time_ms BETWEEN ? AND ?", strArr2, "event_time_ms ASC", str);
            if (a != null) {
                int columnIndexOrThrow = a.getColumnIndexOrThrow("event_time_ms");
                int columnIndexOrThrow2 = a.getColumnIndexOrThrow(NetworkLatencyContract.NetworkLatencyColumns.LATENCY);
                int columnIndexOrThrow3 = a.getColumnIndexOrThrow("network_type");
                int columnIndexOrThrow4 = a.getColumnIndexOrThrow("tag");
                int columnIndexOrThrow5 = a.getColumnIndexOrThrow("device_state");
                int columnIndexOrThrow6 = a.getColumnIndexOrThrow(NetworkLatencyContract.NetworkLatencyColumns.SUCCESSFUL);
                while (a.moveToNext()) {
                    long j3 = a.getLong(columnIndexOrThrow);
                    long j4 = a.getLong(columnIndexOrThrow2);
                    int i5 = a.getInt(columnIndexOrThrow3);
                    int i6 = a.getInt(columnIndexOrThrow4);
                    int i7 = a.getInt(columnIndexOrThrow5);
                    if (a.getInt(columnIndexOrThrow6) == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    arrayList.add(new NetworkLatencyEvent(j3, j4, i5, i6, i7, z));
                }
            }
            if (a != null) {
                a.close();
            }
            sqj = this.f44765b;
        } catch (IllegalArgumentException e) {
            try {
                Log.e("tag", "Unable to query radio logs: ", e);
                sqj = this.f44765b;
            } catch (Throwable th2) {
                this.f44765b.mo25971a();
                throw th2;
            }
        } catch (Throwable th3) {
            bqye.m113761a(th, th3);
        }
        sqj.mo25971a();
        return arrayList;
        throw th;
    }
}
