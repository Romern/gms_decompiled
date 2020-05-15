package p000;

import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Fragment;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/* renamed from: fpk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fpk extends Fragment {

    /* renamed from: a */
    public final SimpleDateFormat f17083a = new SimpleDateFormat("MMM d,yyyy h:mm a");

    /* renamed from: b */
    public String f17084b = "";

    /* renamed from: c */
    TextView f17085c;

    /* renamed from: d */
    public View f17086d;

    /* renamed from: e */
    Button f17087e;

    /* renamed from: f */
    Button f17088f;

    /* renamed from: g */
    Button f17089g;

    /* renamed from: h */
    Button f17090h;

    /* renamed from: i */
    private final String f17091i = String.format("%25.25s(%.10s) |\t%6s |\t%5s |\t%7s |\t%7s |\t%6s |\t%6s", "Component", "Tag", "Network", "State", "Wakeups", "TTL Lat", "TTL Evt", "TTL Fail");

    /* renamed from: a */
    public static final long m12122a(bpvw bpvw) {
        if ((bpvw.f139437a & 512) == 0) {
            return 0;
        }
        double d = (double) bpvw.f139444h;
        double d2 = bpvw.f139447k;
        Double.isNaN(d);
        return Math.round(d * d2);
    }

    /* renamed from: b */
    public final Date mo11105b() {
        try {
            this.f17088f = (Button) this.f17086d.findViewById(C0126R.C0129id.end_date_button);
            this.f17090h = (Button) this.f17086d.findViewById(C0126R.C0129id.end_time_button);
            SimpleDateFormat simpleDateFormat = this.f17083a;
            String valueOf = String.valueOf(this.f17088f.getText());
            String valueOf2 = String.valueOf(this.f17090h.getText());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(valueOf2).length());
            sb.append(valueOf);
            sb.append(" ");
            sb.append(valueOf2);
            return simpleDateFormat.parse(String.valueOf(sb.toString()));
        } catch (ParseException e) {
            Log.e("ShareRadioActivity", "Failed to parse text when creating end date", e);
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00da, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00db, code lost:
        android.util.Log.e("ShareRadioActivity", "Failed to parse text when creating start or end date", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00e0, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00e1, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00e2, code lost:
        android.util.Log.e("ShareRadioActivity", "Failed to create radio activity summary log file", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00e7, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00da A[ExcHandler: ParseException (r0v2 'e' java.text.ParseException A[CUSTOM_DECLARE]), Splitter:B:1:0x0004] */
    /* renamed from: c */
    public final void mo11106c() {
        FileWriter fileWriter;
        try {
            File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), "WirelessRadioActivitySummary.txt");
            file.createNewFile();
            fileWriter = new FileWriter(file);
            SimpleDateFormat simpleDateFormat = this.f17083a;
            String valueOf = String.valueOf(this.f17087e.getText());
            String valueOf2 = String.valueOf(this.f17089g.getText());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(valueOf2).length());
            sb.append(valueOf);
            sb.append(" ");
            sb.append(valueOf2);
            Date parse = simpleDateFormat.parse(sb.toString());
            SimpleDateFormat simpleDateFormat2 = this.f17083a;
            String valueOf3 = String.valueOf(this.f17088f.getText());
            String valueOf4 = String.valueOf(this.f17090h.getText());
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf3).length() + 1 + String.valueOf(valueOf4).length());
            sb2.append(valueOf3);
            sb2.append(" ");
            sb2.append(valueOf4);
            Date parse2 = simpleDateFormat2.parse(sb2.toString());
            long time = parse.getTime();
            long time2 = parse2.getTime();
            if (cdna.m134124e()) {
                int i = Build.VERSION.SDK_INT;
                fileWriter.write("GMS Core Radio Activity:\n");
                m12125a(fileWriter);
                fileWriter.write("Lat = Latency, Med = Median, Std dev = Standard deviation, TTL = Total, Evt = Events\n");
                if (cdna.m134126g()) {
                    m12126a(fileWriter, 0, time, time2);
                }
                if (cdna.m134127h()) {
                    m12126a(fileWriter, 1, time, time2);
                }
            }
        } catch (IOException e) {
            Log.e("ShareRadioActivity", "Failed to write to radio activity summary log file", e);
        } catch (ParseException e2) {
        }
        fileWriter.close();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.share_wireless_radio_activity_summary, viewGroup, false);
        this.f17086d = inflate;
        TextView textView = (TextView) inflate.findViewById(C0126R.C0129id.dump);
        this.f17085c = textView;
        textView.setMovementMethod(new ScrollingMovementMethod());
        this.f17087e = (Button) this.f17086d.findViewById(C0126R.C0129id.start_date_button);
        this.f17088f = (Button) this.f17086d.findViewById(C0126R.C0129id.end_date_button);
        this.f17089g = (Button) this.f17086d.findViewById(C0126R.C0129id.start_time_button);
        this.f17090h = (Button) this.f17086d.findViewById(C0126R.C0129id.end_time_button);
        Button button = this.f17087e;
        button.setOnClickListener(new fpj(this, button, this.f17089g, 1));
        Button button2 = this.f17088f;
        button2.setOnClickListener(new fpj(this, button2, this.f17090h, 1));
        Button button3 = this.f17089g;
        button3.setOnClickListener(new fpj(this, this.f17087e, button3, 2));
        Button button4 = this.f17090h;
        button4.setOnClickListener(new fpj(this, this.f17088f, button4, 2));
        Calendar instance = Calendar.getInstance();
        int i = instance.get(5);
        int i2 = instance.get(2);
        int i3 = instance.get(1);
        int i4 = instance.get(11);
        int i5 = instance.get(12);
        this.f17087e.setText(m12124a(i, i2, i3));
        this.f17088f.setText(m12124a(i, i2, i3));
        this.f17089g.setText(m12123a(0, 0));
        this.f17090h.setText(m12123a(i4, i5));
        ((Button) this.f17086d.findViewById(C0126R.C0129id.showDump)).setOnClickListener(new fpg(this));
        ((Button) this.f17086d.findViewById(C0126R.C0129id.shareDump)).setOnClickListener(new fph(this));
        return this.f17086d;
    }

    /* renamed from: a */
    public static String m12123a(int i, int i2) {
        Calendar instance = Calendar.getInstance();
        instance.set(11, i);
        instance.set(12, i2);
        return new SimpleDateFormat("h:mm a").format(instance.getTime());
    }

    /* renamed from: a */
    public static String m12124a(int i, int i2, int i3) {
        Calendar instance = Calendar.getInstance();
        instance.set(i3, i2, i);
        return new SimpleDateFormat("MMM d, yyyy").format(instance.getTime());
    }

    /* renamed from: a */
    public static final void m12125a(FileWriter fileWriter) {
        try {
            fileWriter.write("  ");
        } catch (IOException e) {
            Log.e("ShareRadioActivity", "Failed to write to radio activity summary log file", e);
        }
    }

    /* renamed from: a */
    public static final void m12126a(FileWriter fileWriter, int i, long j, long j2) {
        Integer num;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        String str;
        String str2;
        String a = sks.m35543a(i);
        try {
            fileWriter.write(String.valueOf(a).concat("\n"));
            m12125a(fileWriter);
            List<bpvw> a2 = smr.m35675a(j, j2, i);
            fileWriter.write(String.valueOf(smr.f44772a).concat("\n"));
            if (!a2.isEmpty()) {
                Collections.sort(a2, new fpf());
                Collections.reverse(a2);
                for (bpvw bpvw : a2) {
                    Object[] objArr = new Object[12];
                    objArr[0] = shq.m35306a(bpvw.f139438b);
                    String valueOf = String.valueOf(Integer.toHexString(bpvw.f139438b));
                    objArr[1] = valueOf.length() == 0 ? new String("0x") : "0x".concat(valueOf);
                    objArr[2] = a;
                    Long l = null;
                    if ((2 & bpvw.f139437a) != 0) {
                        num = Integer.valueOf(bpvw.f139439c);
                    } else {
                        num = null;
                    }
                    objArr[3] = num;
                    if ((bpvw.f139437a & 8) != 0) {
                        l = Long.valueOf(bpvw.f139441e);
                    }
                    objArr[4] = l;
                    String str3 = " ";
                    if ((bpvw.f139437a & 16) != 0) {
                        obj = Long.valueOf(bpvw.f139442f);
                    } else {
                        obj = str3;
                    }
                    objArr[5] = obj;
                    if ((bpvw.f139437a & 128) != 0) {
                        obj2 = Long.valueOf(bpvw.f139445i);
                    } else {
                        obj2 = str3;
                    }
                    objArr[6] = obj2;
                    if ((bpvw.f139437a & 32) != 0) {
                        obj3 = Long.valueOf(bpvw.f139443g);
                    } else {
                        obj3 = str3;
                    }
                    objArr[7] = obj3;
                    if ((bpvw.f139437a & 64) != 0) {
                        obj4 = Long.valueOf(m12122a(bpvw));
                    } else {
                        obj4 = str3;
                    }
                    objArr[8] = obj4;
                    if ((bpvw.f139437a & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        str = String.format("%.0f", Double.valueOf(Math.sqrt(bpvw.f139446j)));
                    } else {
                        str = str3;
                    }
                    objArr[9] = str;
                    if ((bpvw.f139437a & 512) != 0) {
                        str2 = String.format("%.0f", Double.valueOf(bpvw.f139447k));
                    } else {
                        str2 = str3;
                    }
                    objArr[10] = str2;
                    if ((bpvw.f139437a & 1024) != 0) {
                        str3 = String.format("%.0f", Double.valueOf(bpvw.f139448l));
                    }
                    objArr[11] = str3;
                    fileWriter.write(String.format("%25.25s\t%10.10s\t%6s\t%5s\t%7s\t%7s\t%7s\t%7s\t%7s\t%7s\t%6s\t%6s", objArr));
                    fileWriter.write("\n");
                }
                return;
            }
            fileWriter.write("No data\n");
        } catch (IOException e) {
            Log.e("ShareRadioActivity", "Failed to write to radio activity summary log file", e);
        }
    }

    /* renamed from: a */
    public final Date mo11102a() {
        try {
            this.f17087e = (Button) this.f17086d.findViewById(C0126R.C0129id.start_date_button);
            this.f17089g = (Button) this.f17086d.findViewById(C0126R.C0129id.start_time_button);
            SimpleDateFormat simpleDateFormat = this.f17083a;
            String valueOf = String.valueOf(this.f17087e.getText());
            String valueOf2 = String.valueOf(this.f17089g.getText());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(valueOf2).length());
            sb.append(valueOf);
            sb.append(" ");
            sb.append(valueOf2);
            return simpleDateFormat.parse(String.valueOf(sb.toString()));
        } catch (ParseException e) {
            Log.e("ShareRadioActivity", "Failed to parse text when creating start date", e);
            return null;
        }
    }

    /* renamed from: a */
    public final void mo11103a(int i, Date date, Date date2, StringBuilder sb) {
        Integer num;
        Object obj;
        String str;
        long time = date.getTime();
        long time2 = date2.getTime();
        String a = sks.m35543a(i);
        sb.append(a);
        sb.append("\n");
        List<bpvw> a2 = smr.m35675a(time, time2, i);
        sb.append(this.f17091i);
        sb.append("\n");
        if (a2.isEmpty()) {
            sb.append("No data\n");
            return;
        }
        for (bpvw bpvw : a2) {
            Object[] objArr = new Object[8];
            objArr[0] = shq.m35306a(bpvw.f139438b);
            String valueOf = String.valueOf(Integer.toHexString(bpvw.f139438b));
            objArr[1] = valueOf.length() == 0 ? new String("0x") : "0x".concat(valueOf);
            objArr[2] = a;
            Long l = null;
            if ((2 & bpvw.f139437a) != 0) {
                num = Integer.valueOf(bpvw.f139439c);
            } else {
                num = null;
            }
            objArr[3] = num;
            if ((8 & bpvw.f139437a) != 0) {
                l = Long.valueOf(bpvw.f139441e);
            }
            objArr[4] = l;
            String str2 = " ";
            if ((bpvw.f139437a & 64) != 0) {
                obj = Long.valueOf(m12122a(bpvw));
            } else {
                obj = str2;
            }
            objArr[5] = obj;
            if ((bpvw.f139437a & 512) != 0) {
                str = String.format("%.0f", Double.valueOf(bpvw.f139447k));
            } else {
                str = str2;
            }
            objArr[6] = str;
            if ((bpvw.f139437a & 1024) != 0) {
                str2 = String.format("%.0f", Double.valueOf(bpvw.f139448l));
            }
            objArr[7] = str2;
            sb.append(String.format("%25.25s(%.10s) |\t%6s |\t%5s |\t%7s |\t%7s |\t%6s |\t%6s", objArr));
            sb.append("\n");
        }
    }

    /* renamed from: a */
    public final boolean mo11104a(Date date, Date date2) {
        if (!date.after(date2)) {
            return false;
        }
        C1350sh b = new C1349sg(getActivity()).mo15904b();
        b.setTitle("Input Error");
        b.f27024a.mo15889b("End date must be after start date.");
        b.f27024a.mo15886a(-3, "OK", new fpi());
        b.show();
        return true;
    }
}
