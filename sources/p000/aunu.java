package p000;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.text.MessageFormat;
import java.util.Date;
import java.util.logging.Formatter;
import java.util.logging.LogRecord;

/* renamed from: aunu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aunu extends Formatter {
    public final String format(LogRecord logRecord) {
        StringBuilder sb = new StringBuilder();
        sb.append(MessageFormat.format("{0, date} {0, time} ", new Date(logRecord.getMillis())));
        sb.append(logRecord.getLoggerName());
        sb.append(" ");
        sb.append(formatMessage(logRecord));
        sb.append("\n");
        if (logRecord.getThrown() != null) {
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter);
            bqye.m113760a(logRecord.getThrown(), printWriter);
            printWriter.close();
            sb.append(stringWriter.toString());
        }
        return sb.toString();
    }
}
