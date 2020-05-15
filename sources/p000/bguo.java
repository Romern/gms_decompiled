package p000;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Formatter;
import java.util.logging.Level;
import java.util.logging.LogRecord;

/* renamed from: bguo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bguo extends Formatter {

    /* renamed from: a */
    private static final DateFormat f117588a = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss.SSSZ ", Locale.US);

    public final String format(LogRecord logRecord) {
        char c;
        PrintWriter printWriter;
        StringBuilder sb = new StringBuilder();
        sb.append(f117588a.format(new Date(logRecord.getMillis())));
        Level level = logRecord.getLevel();
        if (level != Level.FINER) {
            c = level != Level.FINE ? level != Level.INFO ? level != Level.WARNING ? level == Level.SEVERE ? 'E' : '?' : 'W' : 'I' : 'D';
        } else {
            c = 'V';
        }
        sb.append(c);
        sb.append(" ");
        sb.append(formatMessage(logRecord));
        sb.append("\n");
        Throwable thrown = logRecord.getThrown();
        if (thrown != null) {
            try {
                StringWriter stringWriter = new StringWriter();
                printWriter = new PrintWriter(stringWriter);
                try {
                    bqye.m113760a(thrown, printWriter);
                    sb.append(stringWriter.toString());
                    bgzo.m100462a(printWriter);
                } catch (Throwable th) {
                    th = th;
                    bgzo.m100462a(printWriter);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                printWriter = null;
                bgzo.m100462a(printWriter);
                throw th;
            }
        }
        return sb.toString();
    }
}
