package p000;

import android.content.Intent;
import android.util.Pair;
import com.google.android.contextmanager.controller.EventHandler$AlarmSetter;

/* renamed from: drs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class drs implements Runnable {

    /* renamed from: a */
    final /* synthetic */ int f13893a;

    /* renamed from: b */
    final /* synthetic */ Intent f13894b;

    /* renamed from: c */
    final /* synthetic */ EventHandler$AlarmSetter f13895c;

    public drs(EventHandler$AlarmSetter eventHandler$AlarmSetter, int i, Intent intent) {
        this.f13895c = eventHandler$AlarmSetter;
        this.f13893a = i;
        this.f13894b = intent;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnsi.a(java.lang.String, int, java.lang.Object):void
     arg types: [java.lang.String, int, android.content.Intent]
     candidates:
      bnsi.a(java.lang.String, byte, byte):void
      bnsi.a(java.lang.String, double, double):void
      bnsi.a(java.lang.String, int, byte):void
      bnsi.a(java.lang.String, int, int):void
      bnsi.a(java.lang.String, int, long):void
      bnsi.a(java.lang.String, int, boolean):void
      bnsi.a(java.lang.String, long, int):void
      bnsi.a(java.lang.String, long, long):void
      bnsi.a(java.lang.String, long, java.lang.Object):void
      bnsi.a(java.lang.String, long, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, byte):void
      bnsi.a(java.lang.String, java.lang.Object, int):void
      bnsi.a(java.lang.String, java.lang.Object, long):void
      bnsi.a(java.lang.String, java.lang.Object, java.lang.Object):void
      bnsi.a(java.lang.String, java.lang.Object, boolean):void
      bnsi.a(java.lang.String, boolean, java.lang.Object):void
      bnsi.a(java.lang.String, boolean, boolean):void
      bnsi.a(java.lang.String, int, java.lang.Object):void */
    public final void run() {
        Pair pair = (Pair) this.f13895c.f7695a.get(this.f13893a);
        if (pair == null) {
            bnsl bnsl = (bnsl) dss.f13961a.mo68388c();
            bnsl.mo68432a("drs", "run", 603, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68413a("[EventHandler] Didn't find runnable for alarm id=%s, intent=%s", this.f13893a, (Object) this.f13894b);
            return;
        }
        Runnable runnable = (Runnable) pair.first;
        dqx dqx = (dqx) pair.second;
        if (!dqx.f13840a.endsWith("-delayed")) {
            dqx.f13840a = String.valueOf(dqx.f13840a).concat("-delayed");
        }
        new Object[1][0] = dqx;
        long longExtra = this.f13894b.getLongExtra("sessionId", -2147483648L);
        if (longExtra == this.f13895c.f7697c) {
            Object[] objArr = {Integer.valueOf(this.f13893a), runnable};
            this.f13895c.f7696b.remove(runnable);
            dwq.m9646C().mo10109c(dqx);
            this.f13895c.f7695a.remove(this.f13893a);
            runnable.run();
        } else if (dss.m9250a(3)) {
            int intExtra = this.f13894b.getIntExtra("alarmId", -1);
            long j = this.f13895c.f7697c;
            String valueOf = String.valueOf(this.f13894b);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 140);
            sb.append("Skipping alarm from previous session: alarmId=");
            sb.append(intExtra);
            sb.append(" intentSessionId=");
            sb.append(longExtra);
            sb.append(" currentSessionId=");
            sb.append(j);
            sb.append(" intent=");
            sb.append(valueOf);
            sb.toString();
        }
    }
}
